package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addFlight_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/CSS/addFlightcss.css");
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Management Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"addFlight.css\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/48fb0be74f.js\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"icon\" href=\"https://img.favpng.com/2/22/3/airplane-aircraft-logo-icon-a5-png-favpng-g0VhdxjfFf5Uedzuma2CxapfQ.jpg\">\r\n");
      out.write("        <style> ");
      out.write("* {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-image: url(\"https://images.deccanherald.com/deccanherald%2Fimport%2Fsites%2Fdh%2Ffiles%2Farticleimages%2F2022%2F06%2F04%2Fplane-istock-1-1115082-1654303894.png?w=1200&ar=40%3A21&auto=format%2Ccompress&ogImage=true&mode=crop\");\n");
      out.write("    background-size: 100%;\n");
      out.write("    background-color: whitesmoke;\n");
      out.write("    height: 100vh;\n");
      out.write("    width: 100vw;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("}\n");
      out.write(".content {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-evenly;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    height: 100%;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write(".content h1 {\n");
      out.write("    font-size: 3em;\n");
      out.write("}\n");
      out.write(".background {\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: -1;\n");
      out.write("    background-image: url(\"https://www.farecompare.com/wp-content/uploads/2022/08/early-morning-flights.jpg\");\n");
      out.write("    background-size: 120%;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    clip-path: polygon(100% 0, 100% 100%, 0 100%);\n");
      out.write("}\n");
      out.write(".form {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    width: 40%;\n");
      out.write("    height: 70%;\n");
      out.write("    backdrop-filter: blur(10px);\n");
      out.write("    background-color: rgba(255, 255, 255, 0.637);\n");
      out.write("}\n");
      out.write("form {\n");
      out.write("    margin-top: 5%;\n");
      out.write("    width: 90%;\n");
      out.write("    height: 60%;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: space-between;\n");
      out.write("}\n");
      out.write(".form .infor {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    width: 90%;\n");
      out.write("    height: 10%;\n");
      out.write("    display: flex;\n");
      out.write("}\n");
      out.write(".form .infor input{\n");
      out.write("    background-color: rgba(250, 235, 215, 0);\n");
      out.write("    color: black;\n");
      out.write("    width: 60%;\n");
      out.write("    height: 120%;\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: solid 1px rgb(0, 0, 0);\n");
      out.write("}\n");
      out.write(".form .infor select{\n");
      out.write("    background-color: rgba(250, 235, 215, 0);\n");
      out.write("    color: black;\n");
      out.write("    width: 60%;\n");
      out.write("    height: 120%;\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: solid 1px rgb(0, 0, 0);\n");
      out.write("}\n");
      out.write(".form button{\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 1em;\n");
      out.write("    background-color: black;\n");
      out.write("    border: none;\n");
      out.write("    position: absolute;\n");
      out.write("    width: 15%;\n");
      out.write("    height: 6%;\n");
      out.write("    margin: auto;\n");
      out.write("    bottom: 20%;\n");
      out.write("    right: 10%;\n");
      out.write("    transition: .5s ease;\n");
      out.write("    box-shadow: 0px 0px 10px white;\n");
      out.write("}\n");
      out.write(".form button:hover{\n");
      out.write("    color: black;\n");
      out.write("    box-shadow: 0px 0px 10px gray;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.421);\n");
      out.write("}\n");
      out.write(".form #return{\n");
      out.write("    right: 30%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"background\"></div>\r\n");
      out.write("            <h1>Add Flight</h1>\r\n");
      out.write("            <div class=\"form\">\r\n");
      out.write("                <form action=\"\" >\r\n");
      out.write("                    <div class=\"infor\">\r\n");
      out.write("                        <h2>Departure Place: </h2>\r\n");
      out.write("                        <select name=\"departurePlace\" id=\"departure\">\r\n");
      out.write("                            <option value=\"0\">Select province/city</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"infor\">\r\n");
      out.write("                        <h2>Departure Date: </h2>\r\n");
      out.write("                        <input type=\"date\" id=\"date\" name=\"departureDate\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"infor\">\r\n");
      out.write("                        <h2>Destination: </h2>\r\n");
      out.write("                        <select name=\"destination\" id=\"destination\">\r\n");
      out.write("                            <option value=\"0\">Select province/city</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"infor\">\r\n");
      out.write("                        <h2>Number of seats: </h2>\r\n");
      out.write("                        <input type=\"number\" name=\"numOfSeats\" id=\"\" min=\"0\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"infor\">\r\n");
      out.write("                        <h2>Max cargo weight: </h2>\r\n");
      out.write("                        <input type=\"number\" name=\"maxCargoWeight\" id=\"\" min=\"0\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"infor\">\r\n");
      out.write("                        <h2>Price: </h2>\r\n");
      out.write("                        <input type=\"number\" name=\"price\" id=\"\" min=\"0\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <font style=\"color: seagreen;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.success}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\r\n");
      out.write("                    <button>ADD</button>\r\n");
      out.write("                </form>\r\n");
      out.write("                <button id=\"return\"><a href=\"management\"> BACK</a></button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            async function getDistrict() {\r\n");
      out.write("                const response = await fetch(\"https://provinces.open-api.vn/api/p/\");\r\n");
      out.write("                var districtList = response.json();\r\n");
      out.write("                districtList.then(arr => {\r\n");
      out.write("                    arr.forEach((item) => {\r\n");
      out.write("                        var opt = document.createElement('option');\r\n");
      out.write("                        var opt2 = document.createElement('option');\r\n");
      out.write("                        (async () => {\r\n");
      out.write("                            await (() => {\r\n");
      out.write("                                ;\r\n");
      out.write("                                opt.value = removeAccents(item.name);\r\n");
      out.write("                                opt.innerHTML = removeAccents(item.name);\r\n");
      out.write("                                opt2.value = removeAccents(item.name);\r\n");
      out.write("                                opt2.innerHTML = removeAccents(item.name);\r\n");
      out.write("                            })();\r\n");
      out.write("                            await (() => {\r\n");
      out.write("                                document.getElementById('destination').appendChild(opt);\r\n");
      out.write("                            })();\r\n");
      out.write("                            await (() => {\r\n");
      out.write("                                document.getElementById('departure').appendChild(opt2);\r\n");
      out.write("                            })();\r\n");
      out.write("                        })();\r\n");
      out.write("                    })\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("            ;\r\n");
      out.write("            function getLocalTime() {\r\n");
      out.write("                document.getElementById('date').setAttribute('min', new Date().toLocaleDateString('fr-ca'))\r\n");
      out.write("            }\r\n");
      out.write("            function removeAccents(str) {\r\n");
      out.write("                return str.normalize('NFD')\r\n");
      out.write("                        .replace(/[\\u0300-\\u036f]/g, '')\r\n");
      out.write("                        .replace(/đ/g, 'd').replace(/Đ/g, 'D')\r\n");
      out.write("                        .replace('Tinh', '')\r\n");
      out.write("                        .replace('Thanh pho', '');\r\n");
      out.write("            }\r\n");
      out.write("            document.onreadystatechange = function () {\r\n");
      out.write("                if (document.readyState == \"complete\") {\r\n");
      out.write("                    getLocalTime();\r\n");
      out.write("                    getDistrict();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
