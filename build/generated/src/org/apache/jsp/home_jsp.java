package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Plane Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/homecss.css\">\n");
      out.write("        <link rel=\"icon\"\n");
      out.write("            href=\"https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        <header>\n");
      out.write("            <div class=\"header-logo\">\n");
      out.write("                <h1>FMS <i class=\"fa fa-plane\" aria-hidden=\"true\"></i> airline</h1>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <div class=\"nav-item\">\n");
      out.write("                    <p>Flights</p>\n");
      out.write("                    <div class=\"nav-icon\">\n");
      out.write("                    <i class=\"fa fa-plane\" aria-hidden=\"true\"></i>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav-item\">\n");
      out.write("                    <p>Transaction History</p>\n");
      out.write("                    <div class=\"nav-icon\">\n");
      out.write("                        <i class=\"fa fa-list\" aria-hidden=\"true\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav-item\">\n");
      out.write("                    <p>Searching Id Ticket</p>\n");
      out.write("                    <div class=\"nav-icon\">\n");
      out.write("                        <i class=\"fa fa-ticket\" aria-hidden=\"true\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav-item\">\n");
      out.write("                    <p>Management Mode</p>\n");
      out.write("                    <div class=\"nav-icon\">\n");
      out.write("                        <i class=\"fa fa-wrench\" aria-hidden=\"true\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"flight-box\">\n");
      out.write("                <div class=\"search-bar\">\n");
      out.write("                    <div class=\"search-bar-item1\">\n");
      out.write("                        <p>Departure From: </p>\n");
      out.write("                        <input type=\"text\" name=\"departure\" id=\"departure\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"search-bar-item1\">\n");
      out.write("                        <p>Destination: </p>\n");
      out.write("                        <input type=\"text\" name=\"destination\" id=\"destination\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"search-bar-item2\">\n");
      out.write("                        <p>Departure date:</p>\n");
      out.write("                        <input type=\"datetime-local\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-button\">\n");
      out.write("                    <button id=\"search\">Search <i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
