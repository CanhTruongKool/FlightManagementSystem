package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ticketSearching_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Searching Ticket</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/homecss.css\">\r\n");
      out.write("        <link rel=\"icon\"\r\n");
      out.write("              href=\"https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("        <style>");
      out.write("*{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    background-image: url('https://d1e00ek4ebabms.cloudfront.net/production/48b15eb2-4302-4c1a-a6aa-3040e60ee46f.jpg');\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    width: 100vw;\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("header{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    height: 9%;\r\n");
      out.write("    padding-top: 1%;\r\n");
      out.write("    padding-bottom: 1%;\r\n");
      out.write("    backdrop-filter: blur(25px);\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write(".nav-bar { \r\n");
      out.write("    color: white;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    float: left;\r\n");
      out.write("    justify-content: end;\r\n");
      out.write("}\r\n");
      out.write(".nav-bar .nav-item{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column-reverse;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    width: 20%;\r\n");
      out.write("    margin-right: 1%;\r\n");
      out.write("}\r\n");
      out.write(".nav-bar .nav-item .nav-icon{\r\n");
      out.write("    color: black;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    border-radius: 500px;\r\n");
      out.write("    border: solid 1px white;  \r\n");
      out.write("    width: 40px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    min-width: 40px;\r\n");
      out.write("    min-height: 40px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    transition: .5s ease;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.484);\r\n");
      out.write("}\r\n");
      out.write(".nav-bar .nav-item:hover > .nav-icon{\r\n");
      out.write("    border-color: black ;\r\n");
      out.write("    color: white;\r\n");
      out.write("    background-color: rgba(0, 0, 0, 0.504);\r\n");
      out.write("}\r\n");
      out.write(".header-logo{\r\n");
      out.write("    margin-left: 2%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    background-image: url('https://upload.wikimedia.org/wikipedia/commons/5/57/Airplane_silhouette_S.png');\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: 70%;\r\n");
      out.write("    width: 20%;\r\n");
      out.write("}\r\n");
      out.write(".header-logo h1{\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;    \r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write(".content{\r\n");
      out.write("    background-color: rgba(6, 6, 6, 0.121);\r\n");
      out.write("    width: 90%;\r\n");
      out.write("    height: 80%;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("}\r\n");
      out.write(".search-bar{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    width: 95%;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    justify-content:space-around;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    margin-top: 2%;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.274);\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    border-radius: 7px;\r\n");
      out.write("}\r\n");
      out.write(".search-bar .search-bar-item1{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write(".search-bar .search-bar-item2{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("}\r\n");
      out.write(".search-bar .search-bar-item2 input{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    min-width: 120%;\r\n");
      out.write("}\r\n");
      out.write(".search-bar .search-bar-item2 p{\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write(".search-bar .search-bar-item1 p {\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write(".search-bar p{\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write(".search-bar input{\r\n");
      out.write("    background-color: rgba(240, 248, 255, 0);\r\n");
      out.write("    color: white;\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    height: 120%;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-bottom: solid 1px rgb(255, 255, 255);\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write(".search-bar select{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    color: rgb(255, 255, 255);\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    height: 120%;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-bottom: solid 1px rgb(255, 255, 255);\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write(".search-bar select option{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write(".search-bar input,select:focus{\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write(".search-button{\r\n");
      out.write("    float: right;\r\n");
      out.write("    width: 20%;\r\n");
      out.write("}\r\n");
      out.write(".search-button button{\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding: 10px 60px;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.274);\r\n");
      out.write("    border: none;\r\n");
      out.write("    font-size: 1.1rem;\r\n");
      out.write("    color: white;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    border-radius: 7px;\r\n");
      out.write("    transition: .5s ease;\r\n");
      out.write("}\r\n");
      out.write(".search-button button:hover{\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.488);\r\n");
      out.write("    box-shadow: 0px 0px 10px white;\r\n");
      out.write("}\r\n");
      out.write(".flight-list{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 70%;\r\n");
      out.write("    padding: 0 1%;\r\n");
      out.write("    margin-top: 2%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-around;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("}\r\n");
      out.write(".flight-list .flight{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    height: 30%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".flight .flight-left{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.499);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".flight .flight-right{\r\n");
      out.write("    border-left: 2px dotted #000000;\r\n");
      out.write("    width: 70%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.499);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write(".flight .flight-left h3,p{\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write("    font-weight: bolder;\r\n");
      out.write("}\r\n");
      out.write(".flight-logo h4{\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write("    font-size: 1em;\r\n");
      out.write("    border-top-left-radius: 10px;\r\n");
      out.write("    border-top-right-radius: 10px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    padding: 7px 0;\r\n");
      out.write("    color: white;\r\n");
      out.write("    background-color: #1E3F85;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    background-image: url('https://upload.wikimedia.org/wikipedia/commons/5/57/Airplane_silhouette_S.png');\r\n");
      out.write("    background-size: contain;\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    background-size: 90%;\r\n");
      out.write("    font-weight: bolder;\r\n");
      out.write("}\r\n");
      out.write(".flight-right{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("}\r\n");
      out.write(".flight-right-content{\r\n");
      out.write("    margin-bottom: 2%;\r\n");
      out.write("    margin-left: 5%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    width: 90%;\r\n");
      out.write("}\r\n");
      out.write(".flight-right-content p{\r\n");
      out.write("    margin-left: 0%;\r\n");
      out.write("    font-size: 0.7rem;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write(".flight-right-content h4{\r\n");
      out.write("    width: 70%;\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".flight-right .book-nav{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    width: 10%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    background-color: red;\r\n");
      out.write("    border-top-right-radius: 10px;\r\n");
      out.write("    border-bottom-right-radius: 10px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: #1E3F85;\r\n");
      out.write("    transition: 1s ease;\r\n");
      out.write("}\r\n");
      out.write(".flight-right .book-nav i{\r\n");
      out.write("    font-size: 1.5em;\r\n");
      out.write("}\r\n");
      out.write(".flight-right .book-nav:hover{\r\n");
      out.write("    width: 15%;\r\n");
      out.write("}\r\n");
      out.write(".flight-right .book-nav:hover > a{\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("    display: inline;\r\n");
      out.write("}\r\n");
      out.write(".flight-right .book-nav a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: black;\r\n");
      out.write("    transition: 1s ease;\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 32%;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    font-size: smaller;\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write("}\r\n");
      out.write(".paging-button{\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    bottom: 2%;\r\n");
      out.write("    right: 5%;\r\n");
      out.write("    width: 20%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-around;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".paging-button button{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: row;\r\n");
      out.write("    justify-content:space-between;\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding: 5px 20px;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.274);\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    border-radius: 7px;\r\n");
      out.write("    transition: .5s ease;\r\n");
      out.write("}\r\n");
      out.write(".paging-button button a{\r\n");
      out.write("    font-size: 1.1rem;\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".paging-button button:hover{\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.488);\r\n");
      out.write("    box-shadow: 0px 0px 10px white;\r\n");
      out.write("}\r\n");
      out.write(".paging-button button a i{\r\n");
      out.write("    font-weight: lighter;\r\n");
      out.write("}\r\n");
      out.write(".searchResult{\r\n");
      out.write("    color: white;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>  \r\n");
      out.write("        <header>\r\n");
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
      out.write("            <a class=\"nav-icon\" href=\"login\">\r\n");
      out.write("                <i class=\"fa fa-wrench\" aria-hidden=\"true\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <form  class=\"flight-box\" action=\"ticketSearching\" method='post'>\r\n");
      out.write("                <div class=\"search-bar\">\r\n");
      out.write("                    <div class=\"search-bar-item1\">\r\n");
      out.write("                        <p>Enter ticket code: </p> \r\n");
      out.write("                        <input name=\"Code\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"search-button\">\r\n");
      out.write("                        <button id=\"search\">Search <i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <h3 style=\"color: white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.searchResult}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            let Namefield = document.getElementById(\"name\");\r\n");
      out.write("            let IDfield = document.getElementById(\"identifyNumber\");\r\n");
      out.write("            let okButton = document.getElementById(\"okButton\");\r\n");
      out.write("            let editButton = document.getElementById(\"editButton\");\r\n");
      out.write("\r\n");
      out.write("            function openEdit()\r\n");
      out.write("            {\r\n");
      out.write("                if (Namefield.style.display == \"none\")\r\n");
      out.write("                {\r\n");
      out.write("                    Namefield.style.display = \"block\";\r\n");
      out.write("                    IDfield.style.display = \"block\";\r\n");
      out.write("                    okButton.style.display = \"block\";\r\n");
      out.write("                    editButton.value = \"Close Edit\";\r\n");
      out.write("                } else {\r\n");
      out.write("                    Namefield.style.display = \"none\";\r\n");
      out.write("                    IDfield.style.display = \"none\";\r\n");
      out.write("                    okButton.style.display = \"none\";\r\n");
      out.write("                    editButton.value = \"Edit Ticket\";\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("f");
    _jspx_th_c_set_0.setScope("request");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ticket}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <div class=\"flight\">\r\n");
        out.write("                    <div class=\"flight-right\">\r\n");
        out.write("                        <div class=\"flight-right-content\">\r\n");
        out.write("                            <h4>Flight ID:<p>FMS-A0");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getFlightID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <p></h4>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"flight-right-content\">\r\n");
        out.write("                            <h4>Departure from: <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.flight.getDeparturePlace()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <p></h4>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"flight-right-content\">\r\n");
        out.write("                            <h4>Destination :<p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.flight.getDestination()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <p></h4>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"flight-right-content\">\r\n");
        out.write("                            <h4>Date/Time <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.flight.getDepartureDate().toString().replace(\"T\", \" AT \")}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <p></h4>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"flight-travel\">\r\n");
        out.write("                            <form action=\"editTicket\" method=\"post\">\r\n");
        out.write("                                <div class=\"flight-right-content\">\r\n");
        out.write("                                    <input id=\"Code\" name=\"Code\" style=\"display: none\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getCode()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                    <h4>Passenger name: <p> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.passenger.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p> \r\n");
        out.write("                                        <input id=\"name\" name=\"name\" style=\"display: none\" value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.passenger.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                    </h4>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"flight-right-content\">\r\n");
        out.write("                                    <h4>Passenger phone: <p> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.passenger.getPhoneNumber()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                    <input id=\"phoneNumber\" name=\"phone\" style=\"display: none\" value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.passenger.getPhoneNumber()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                    </h4>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"flight-right-content\">\r\n");
        out.write("                                    <h4>Passenger ID:<p> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.passenger.getIdentityNumber()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                        <input id=\"identifyNumber\" name=\"identifyNumber\" style=\"display: none\"  value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.passenger.getIdentityNumber()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                    </h4>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"flight-right-content\">                                  \r\n");
        out.write("                                    <h4><button id=\"okButton\" style=\"display: none\" >OK</button></h4>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </form>\r\n");
        out.write("                            <h4><button id=\"editButton\" onclick=\"openEdit()\" >Edit Ticket</button></h4>\r\n");
        out.write("                            <div class=\"flight-right-content\">\r\n");
        out.write("                                <h4>Code: <p> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getCode()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <p></h4>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"flight-right-content\">\r\n");
        out.write("                                <h4>Price: <p> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.flight.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <p></h4>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"flight-right-content\">\r\n");
        out.write("                                ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_1.setVar("ticketStatus");
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ticketStatus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ticketStatus == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <button><a href=\"refundTicket?Code=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.getCode()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Refund ticket</a></button>\r\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ticketStatus == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <h4> This ticket has been canceled </h4>>\r\n");
        out.write("                                ");
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
