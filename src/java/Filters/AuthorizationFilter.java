package Filters;

import java.io.IOException;
import java.util.stream.Stream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/*" })
public class AuthorizationFilter implements Filter {
    private String[] _ignore;

    public AuthorizationFilter() {
        _ignore = new String[] {
                "404.jsp",
                "footer.jsp",
                "header.jsp",
                "home.jsp",
                "login.jsp",
                "navBar.jsp",
                "ticketSearching.jsp",
                "transactionList.jsp",
                "home",
                "login",
                "buy",
                "viewflight",
                "searchflight",
                "viewtrans",
                "booking",
                "changeticket",
                "bookingCargo",
                "editTicket",
                "refundTicket",
                "ticketSearching"
        };
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession(false);
        if (!isIgnore(httpServletRequest) && !isSessionValid(session)) {
            ((HttpServletResponse) response).sendRedirect("login");
            return;
        }
        filterChain.doFilter(httpServletRequest, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    private boolean isSessionValid(HttpSession session) {
        if (session == null)
            return false;
        if (session.getAttribute("id") == null)
            return false;
        return true;
    }

    private boolean isIgnore(ServletRequest request) {
        String uri = ((HttpServletRequest) request).getRequestURI();
        return Stream.of(_ignore).anyMatch((ignore) -> uri.contains(ignore));
    }
}
