package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managementMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/CSS/managementMenuCss.css");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Management Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"managementCss.css\">\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/48fb0be74f.js\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("    href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"https://img.favpng.com/2/22/3/airplane-aircraft-logo-icon-a5-png-favpng-g0VhdxjfFf5Uedzuma2CxapfQ.jpg\">\r\n");
      out.write("    <style>");
      out.write("*{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    width: 100vw;\n");
      out.write("    height: 100vh;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".nav-bar{\n");
      out.write("    background-color: #87CEEB;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 10%;\n");
      out.write("    position: fixed;\n");
      out.write("    border-bottom: groove rgba(128, 128, 128, 0.201);\n");
      out.write("}\n");
      out.write(".nav-bar nav{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: space-evenly;\n");
      out.write("}\n");
      out.write(".nav-bar .logo{\n");
      out.write("    background-color: #14306bb1;\n");
      out.write("    color: white;\n");
      out.write("    background-image: url(\"https://upload.wikimedia.org/wikipedia/commons/5/57/Airplane_silhouette_S.png\");\n");
      out.write("    background-size: contain;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: 90%;\n");
      out.write("    background-position: 10% 30%;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("    margin-left: 2%;\n");
      out.write("    border: groove gray;\n");
      out.write("    width: 15%;\n");
      out.write("    height: 50%;\n");
      out.write("    clip-path: polygon(0% 30%, 20% 0%, 100% 0%, 100% 70%, 80% 100%, 0% 100% );\n");
      out.write("}\n");
      out.write(".nav-bar .title {\n");
      out.write("    display: flex;\n");
      out.write("    font-size: larger;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    width: 40%;\n");
      out.write("    margin-left: 13%;\n");
      out.write("}\n");
      out.write(".nav-bar .user-title{\n");
      out.write("    display: flex;\n");
      out.write("    width: 30%;\n");
      out.write("}\n");
      out.write(".nav-bar .user-title h3 {\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".nav-bar .user-title h3 img{\n");
      out.write("    margin: 0 5%;\n");
      out.write("    width: 10%;\n");
      out.write("}\n");
      out.write(".content{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 80%;\n");
      out.write("    display: flex;\n");
      out.write("    margin-top: 5%;\n");
      out.write("    justify-content: space-evenly;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".content .use-case{\n");
      out.write("    border-radius: 10px;\n");
      out.write("    width: 30%;\n");
      out.write("    height: 40%;\n");
      out.write("    border: gray groove;\n");
      out.write("    position: relative;\n");
      out.write("    background-image: url('https://img.freepik.com/free-vector/airplane-flying-high-sky_1308-11193.jpg?w=2000');\n");
      out.write("    background-size: 100%;\n");
      out.write("    transition: 1s ease;\n");
      out.write("    background-position-y: 50%;\n");
      out.write("    background-position-x: 50%;\n");
      out.write("}\n");
      out.write(".content .use-case:hover{\n");
      out.write("    box-shadow: 0px 0px 20px gray;\n");
      out.write("    cursor: pointer;\n");
      out.write("    background-size: 120%;\n");
      out.write("}\n");
      out.write(".content .use-case:hover > .use-case-title{\n");
      out.write("    background-color: rgba(128, 128, 128, 0.577);\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write(".content .use-case-title{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 25%;\n");
      out.write("    background-color: rgba(25, 1, 1, 0.577);\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    color: white;\n");
      out.write("    transition: 1s ease;\n");
      out.write("}\n");
      out.write(".content .use-case:nth-child(2){\n");
      out.write("background-image: url('https://as2.ftcdn.net/v2/jpg/03/32/89/61/1000_F_332896110_vTQiZVCvBPJsKo7kp93oMDcFsHXtabZM.jpg');\n");
      out.write("}\n");
      out.write(".content .use-case:nth-child(3){\n");
      out.write("background-image: url('https://t4.ftcdn.net/jpg/03/75/16/63/360_F_375166377_1e2a3T80447OuYmudFNacI9igUpxXSCP.jpg');\n");
      out.write("}\n");
      out.write(".content .use-case:nth-child(4){\n");
      out.write("background-image: url('https://7228775.fs1.hubspotusercontent-na1.net/hubfs/7228775/FA-for-Airlines-Header.png');\n");
      out.write("}\n");
      out.write(".content .use-case:nth-child(5){\n");
      out.write("background-image: url('https://media.istockphoto.com/id/502775872/vector/loading.jpg?s=612x612&w=0&k=20&c=ZGMHn07qxdbNGOrrp3NFiqRihYGGPJl98TabBBkVyEU=');\n");
      out.write("}\n");
      out.write(".content .use-case:last-of-type{\n");
      out.write("background-image: url('https://www.oag.com/hubfs/airline-revenue-management.jpg');\n");
      out.write("}\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"nav-bar\">\r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <h1>FMS <i class=\"fa fa-plane\" aria-hidden=\"true\"></i> airline</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"title\">\r\n");
      out.write("                <h1>Welcome to FMS-airline!</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"user-title\">\r\n");
      out.write("                <h3>Welcome User: <img src=\"https://cdn-icons-png.flaticon.com/512/3177/3177440.png\" alt=\"\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <a href=\"logout\">Logout</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <div class=\"use-case\">\r\n");
      out.write("            <div class=\"use-case-title\">\r\n");
      out.write("               <a href=\"addFlight\"><h2>Create Flight</h2></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"use-case\">\r\n");
      out.write("            <div class=\"use-case-title\">\r\n");
      out.write("                <h2>Flight List</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"use-case\">\r\n");
      out.write("            <div class=\"use-case-title\">\r\n");
      out.write("                <h2>Passenger List</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"use-case\">\r\n");
      out.write("            <div class=\"use-case-title\">\r\n");
      out.write("                <h2>Crew List</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"use-case\">\r\n");
      out.write("            <div class=\"use-case-title\">\r\n");
      out.write("                <h2>Cargo List</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"use-case\">\r\n");
      out.write("            <div class=\"use-case-title\">\r\n");
      out.write("                <h2>Revenue</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
