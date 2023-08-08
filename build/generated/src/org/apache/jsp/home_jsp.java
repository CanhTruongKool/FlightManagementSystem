package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/CSS/homecss.css");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/navBar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Home page</title>\n");
      out.write("        <link rel=\"icon\"\n");
      out.write("              href=\"https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/homecss.css\" type=\"text/css\">\n");
      out.write("        <style>");
      out.write("*{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: 'Roboto', sans-serif;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    background-image: url('https://d1e00ek4ebabms.cloudfront.net/production/48b15eb2-4302-4c1a-a6aa-3040e60ee46f.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("    width: 100vw;\n");
      out.write("    height: 100vh;\n");
      out.write("}\n");
      out.write("header{\n");
      out.write("    display: flex;\n");
      out.write("    width: 100%;\n");
      out.write("    backdrop-filter: blur(10px);\n");
      out.write("    height: 9%;\n");
      out.write("    padding-top: 1%;\n");
      out.write("    padding-bottom: 1%;\n");
      out.write("    backdrop-filter: blur(25px);\n");
      out.write("    justify-content: space-between;\n");
      out.write("}\n");
      out.write(".nav-bar { \n");
      out.write("    color: white;\n");
      out.write("    display: flex;\n");
      out.write("    width: 60%;\n");
      out.write("    float: left;\n");
      out.write("    justify-content: end;\n");
      out.write("}\n");
      out.write(".nav-bar .nav-item{\n");
      out.write("    cursor: pointer;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column-reverse;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    width: 20%;\n");
      out.write("    margin-right: 1%;\n");
      out.write("}\n");
      out.write(".nav-bar .nav-item .nav-icon{\n");
      out.write("    color: black;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    border-radius: 500px;\n");
      out.write("    border: solid 1px white;  \n");
      out.write("    width: 40px;\n");
      out.write("    height: 40px;\n");
      out.write("    min-width: 40px;\n");
      out.write("    min-height: 40px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    transition: .5s ease;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.484);\n");
      out.write("}\n");
      out.write(".nav-bar .nav-item:hover > .nav-icon{\n");
      out.write("    border-color: black ;\n");
      out.write("    color: white;\n");
      out.write("    background-color: rgba(0, 0, 0, 0.504);\n");
      out.write("}\n");
      out.write(".header-logo{\n");
      out.write("    margin-left: 2%;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    background-image: url('https://upload.wikimedia.org/wikipedia/commons/5/57/Airplane_silhouette_S.png');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: 70%;\n");
      out.write("    width: 20%;\n");
      out.write("}\n");
      out.write(".header-logo h1{\n");
      out.write("    font-family: 'Times New Roman', Times, serif;    \n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".content{\n");
      out.write("    background-color: rgba(6, 6, 6, 0.121);\n");
      out.write("    width: 90%;\n");
      out.write("    height: 80%;\n");
      out.write("    backdrop-filter: blur(10px);\n");
      out.write("}\n");
      out.write(".search-bar{\n");
      out.write("    display: flex;\n");
      out.write("    width: 95%;\n");
      out.write("    margin: auto;\n");
      out.write("    justify-content:space-around;\n");
      out.write("    align-items: center;\n");
      out.write("    margin-top: 2%;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.274);\n");
      out.write("    height: 50px;\n");
      out.write("    border-radius: 7px;\n");
      out.write("}\n");
      out.write(".search-bar .search-bar-item1{\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    width: 30%;\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write(".search-bar .search-bar-item2{\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("}\n");
      out.write(".search-bar .search-bar-item2 input{\n");
      out.write("    min-width: 120%;\n");
      out.write("}\n");
      out.write(".search-bar .search-bar-item2 p{\n");
      out.write("float: left;\n");
      out.write("}\n");
      out.write(".search-bar .search-bar-item1 p {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write(".search-bar p{\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".search-bar input{\n");
      out.write("    background-color: rgba(240, 248, 255, 0);\n");
      out.write("    color: white;\n");
      out.write("    width: 50%;\n");
      out.write("    height: 120%;\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: solid 1px rgb(255, 255, 255);\n");
      out.write("    padding-bottom: 5px;\n");
      out.write("}\n");
      out.write(".search-bar input:last-of-type{\n");
      out.write("    width: 60%;\n");
      out.write("}\n");
      out.write(".search-bar input:focus{\n");
      out.write("        outline: none;\n");
      out.write("}\n");
      out.write(".search-button{\n");
      out.write("    float: right;\n");
      out.write("    width: 20%;\n");
      out.write("}\n");
      out.write(".search-button button{\n");
      out.write("    float: right;\n");
      out.write("    padding: 10px 60px;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.274);\n");
      out.write("    border: none;\n");
      out.write("    font-size: 1.1rem;\n");
      out.write("    color: white;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 7px;\n");
      out.write("    transition: .5s ease;\n");
      out.write("}\n");
      out.write(".search-button button:hover{\n");
      out.write("    background-color: rgba(255, 255, 255, 0.488);\n");
      out.write("    box-shadow: 0px 0px 10px white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".searchResult{\n");
      out.write("    color: white;\n");
      out.write("    margin-top:20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("}\n");
      out.write(".flight-list{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 70%;\n");
      out.write("    padding: 0 1%;\n");
      out.write("    margin-top: 2%;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-around;\n");
      out.write("    align-items: center;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("}\n");
      out.write(".flight-list .flight{\n");
      out.write("    display: flex;\n");
      out.write("    width: 30%;\n");
      out.write("    height: 30%;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".flight .flight-left{\n");
      out.write("    position: relative;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    width: 30%;\n");
      out.write("    height: 100%;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.499);\n");
      out.write("    border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flight .flight-right{\n");
      out.write("    border-left: 2px dotted #000000;\n");
      out.write("    width: 70%;\n");
      out.write("    height: 100%;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.499);\n");
      out.write("    border-radius: 10px;\n");
      out.write("}\n");
      out.write(".flight .flight-left h3,p{\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\n");
      out.write("    font-weight: bolder;\n");
      out.write("}\n");
      out.write(".flight-logo h4{\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\n");
      out.write("    font-size: 1em;\n");
      out.write("    border-top-left-radius: 10px;\n");
      out.write("    border-top-right-radius: 10px;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    padding: 7px 0;\n");
      out.write("    color: white;\n");
      out.write("    background-color: #1E3F85;\n");
      out.write("    width: 100%;\n");
      out.write("    background-image: url('https://upload.wikimedia.org/wikipedia/commons/5/57/Airplane_silhouette_S.png');\n");
      out.write("    background-size: contain;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    text-align: center;\n");
      out.write("    background-size: 90%;\n");
      out.write("    font-weight: bolder;\n");
      out.write("}\n");
      out.write(".flight-right{\n");
      out.write("    position: relative;\n");
      out.write("    justify-content: center;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("}\n");
      out.write(".flight-right-content{\n");
      out.write("    margin-bottom: 2%;\n");
      out.write("    margin-left: 5%;\n");
      out.write("    display: flex;\n");
      out.write("    width: 90%;\n");
      out.write("}\n");
      out.write(".flight-right-content p{\n");
      out.write("    margin-left: 2%;\n");
      out.write("    float: left;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write(".flight-right-content h4{\n");
      out.write("    width: 50%;\n");
      out.write("     font-family: 'Times New Roman', Times, serif;\n");
      out.write("     font-weight: bold;\n");
      out.write("}\n");
      out.write(".flight-right .book-nav{\n");
      out.write("    cursor: pointer;\n");
      out.write("    flex-direction: column;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    width: 10%;\n");
      out.write("    height: 100%;\n");
      out.write("    right: 0;\n");
      out.write("    background-color: red;\n");
      out.write("    border-top-right-radius: 10px;\n");
      out.write("    border-bottom-right-radius: 10px;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #1E3F85;\n");
      out.write("    transition: 1s ease;\n");
      out.write("}\n");
      out.write(".flight-right .book-nav i{\n");
      out.write("    font-size: 1.5em;\n");
      out.write("}\n");
      out.write(".flight-right .book-nav:hover{\n");
      out.write("    width: 15%;\n");
      out.write("}\n");
      out.write(".flight-right .book-nav:hover > h5{\n");
      out.write("    opacity: 1;\n");
      out.write("    display: inline;\n");
      out.write("}\n");
      out.write(".flight-right .book-nav h5{\n");
      out.write("    transition: 2s ease;\n");
      out.write("    opacity: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 32%;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\n");
      out.write("}");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/homecss.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <div class=\"header-logo\">\r\n");
      out.write("        <h1>FMS <i class=\"fa fa-plane\" aria-hidden=\"true\"></i> airline</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("        <nav class=\"nav-bar\">\r\n");
      out.write("        <div class=\"nav-item\" >\r\n");
      out.write("            <p>Flights</p>\r\n");
      out.write("            <a class=\"nav-icon\" href=\"home\">\r\n");
      out.write("                <i class=\"fa fa-plane\" aria-hidden=\"true\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"nav-item\">\r\n");
      out.write("            <p>Transaction History</p>\r\n");
      out.write("            <a class=\"nav-icon\" href=\"transactionList.jsp\">\r\n");
      out.write("                <i class=\"fa fa-list\" aria-hidden=\"true\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"nav-item\">\r\n");
      out.write("            <p>Searching ID Ticket</p>\r\n");
      out.write("            <a class=\"nav-icon\" href=\"ticketSearching.jsp\">\r\n");
      out.write("                <i class=\"fa fa-ticket\" aria-hidden=\"true\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"nav-item\">\r\n");
      out.write("            <p>Management Mode</p>\r\n");
      out.write("            <a class=\"nav-icon\" href=\"login.jsp\">\r\n");
      out.write("                <i class=\"fa fa-wrench\" aria-hidden=\"true\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("</html>\r\n");
      out.write("           \n");
      out.write("        </header>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h3 class=\"searchResult\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.searchResult}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"container\" style=\"color: white\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"color: white\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div  style=\"position: fixed; bottom: 0; right: 0;\">\n");
      out.write("                ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        document.querySelector('form').addEventListener('submit', function (event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("            const inputElement = document.getElementById('time');\n");
      out.write("            inputElement.value = inputElement.value.replace(' ', 'T'); // Thêm ký tự \"T\" vào trước giờ\n");
      out.write("            this.submit();\n");
      out.write("        });\n");
      out.write("    </script>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("canSearch");
    _jspx_th_c_set_0.setScope("session");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.FlightList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${canSearch != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <form  class=\"flight-box\" action=\"searchflight\" method='post'>\n");
        out.write("                    <div class=\"search-bar\">\n");
        out.write("                        <div class=\"search-bar-item1\">\n");
        out.write("                            <p>Departure Place: </p> \n");
        out.write("                            <select id=\"departure\" name=\"departure\">\n");
        out.write("                                <option>Choose departure</option>\n");
        out.write("                                <option>Ha Noi</option>\n");
        out.write("                                <option>TP Ho Chi Minh</option>\n");
        out.write("                                <option>Hue</option>\n");
        out.write("                                <option>Da Nang</option>\n");
        out.write("                                <option>Hai Duong</option>\n");
        out.write("                                <option>Can Tho</option>\n");
        out.write("                                <option>Gia Lai</option>\n");
        out.write("                            </select>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"search-bar-item1\">\n");
        out.write("                            <p>Destination: </p> \n");
        out.write("                            <select id=\"destination\" name=\"destination\">\n");
        out.write("                                <option>Choose departure</option>\n");
        out.write("                                <option>Ha Noi</option>\n");
        out.write("                                <option>TP Ho Chi Minh</option>\n");
        out.write("                                <option>Hue</option>\n");
        out.write("                                <option>Da Nang</option>\n");
        out.write("                                <option>Hai Duong</option>\n");
        out.write("                                <option>Can Tho</option>\n");
        out.write("                                <option>Gia Lai</option>\n");
        out.write("                            </select>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"search-bar-item2\">\n");
        out.write("                            <p>Departure date:</p> \n");
        out.write("                            <input id=\"time\" name=\"time\" type=\"datetime-local\">\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"search-button\">\n");
        out.write("                            <button id=\"search\">Search <i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </form>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("f");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.FlightList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("                    <div class=\"product\">\n");
          out.write("                        <h4>ID: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h4>\n");
          out.write("                        <h5>Departure place: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDeparturePlace()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" || Destination: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDestination()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>                        \n");
          out.write("                        <h5>At time: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDepartureDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                        <button id=\"search\">View Detail</button>\n");
          out.write("                    </div>  \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("f");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.FlightList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("                    <div class=\"flight-list\">\n");
          out.write("                        <div class=\"flight\">\n");
          out.write("                            <div class=\"flight-left\">\n");
          out.write("                                <div class=\"flight-logo\">\n");
          out.write("                                    <h4>FMS <i class=\"fa fa-plane\" aria-hidden=\"true\"></i>\n");
          out.write("                                        airline</h4>\n");
          out.write("                                </div>\n");
          out.write("                                <h3>Flight ID:</h3>\n");
          out.write("                                <p>ID: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </p>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"flight-right\">\n");
          out.write("                                <div class=\"flight-travel\">\n");
          out.write("                                    <div class=\"flight-right-content\">\n");
          out.write("                                        <h4>Departure Place: </h4>\n");
          out.write("                                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDeparturePlace()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"flight-right-content\">\n");
          out.write("                                        <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDestination()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h4>\n");
          out.write("                                        <p>Ho Chi Minh</p>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"flight-right-content\">\n");
          out.write("                                    <h4>Departure date: </h4>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDepartureDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"flight-right-content\">\n");
          out.write("                                    <h4>Number of seats: </h4>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDepartureDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"flight-right-content\">\n");
          out.write("                                    <h4>Number of Cargo: </h4>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getDepartureDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"book-nav\">\n");
          out.write("                                    <h5>Details</h5>\n");
          out.write("                                    <i class=\"fa fa-caret-right\" aria-hidden=\"true\"></i>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("Page");
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Page > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <button id=\"\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.position}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page -1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Previous </button>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("num");
    _jspx_th_c_set_2.setScope("request");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.num}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Page < num -1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <button id=\"\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.position}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page +1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Next</a></button>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
