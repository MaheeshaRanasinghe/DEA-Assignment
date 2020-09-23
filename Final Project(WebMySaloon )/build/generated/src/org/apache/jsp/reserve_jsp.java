package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class reserve_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");
  
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

String id = request.getParameter("id");
String time = request.getParameter("time");
    HttpSession session2=request.getSession(false);  
        String name=(String)session2.getAttribute("name"); 
        
           HttpSession session4=request.getSession(false);  
        String phone=(String)session4.getAttribute("phone"); 
        
        HttpSession session1=request.getSession(false);  
        String uid=(String)session1.getAttribute("id"); 
        if(session1.getAttribute("id")!= null  ){  
         
      
        
        }  
       
        else{
           response.sendRedirect("../Auth/login.jsp");  
        }

            
      out.write("\n");
      out.write("          \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <title>My Saloon</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"description\" content=\"Vogue template project\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap-4.1.2/bootstrap.min.css\">\n");
      out.write("<link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"super_container\">\n");
      out.write("\t\n");
      out.write("\t<!-- Header -->\n");
      out.write("\n");
      out.write("\t<header class=\"header trans_400\">\n");
      out.write("\t\t<div class=\"header_content d-flex flex-row align-items-center justify-content-center trans_400\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<div>V<span>o</span>black</div>\n");
      out.write("\t\t\t\t\t<div>hair</div>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"hamburger\"><div></div><div></div><div></div></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Main Navigation -->\n");
      out.write("\t\t\t<nav class=\"main_nav\">\n");
      out.write("\t\t\t\t<ul class=\"d-flex flex-row align-items-start justify-content-start\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">Home<div><div></div><div></div><div></div></div></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Services<div><div></div><div></div><div></div></div></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Contact<div><div></div><div></div><div></div></div></a></li>\n");
      out.write("                                         <li><a href=\"./LogOut\">Log Out</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Appointment -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<!-- Menu -->\n");
      out.write("\t\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("\t\t<nav class=\"menu_nav\">\n");
      out.write("\t\t\t<ul class=\"d-flex flex-column align-items-start justify-content-start\">\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Services</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"myreservations.jsp\">My Reservations</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                               <li><a href=\"./LogOut\">Log Out</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("        <div class=\"main\" style=\"width: 100%; height: 100px\"></div>\n");
      out.write("        <div class=\"container\" style=\"margin-top: 20px\" >\n");
      out.write("        <div class=\"card\">\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("      \n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("    \t\t\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("  <div class=\"card-body\">\n");
      out.write(" \n");
      out.write("      <br>\n");
      out.write("      <form action=\"./reserve\" method=\"POST\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Name</label>\n");
      out.write("    <input type=\"text\" readonly=\"\"  class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" value=\"");
      out.print(name );
      out.write("\">\n");
      out.write("      <input type=\"hidden\" name=\"name\" class=\"form-control\" id=\"exampleInputPassword1\" value=\"");
      out.print(name );
      out.write("\" >\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Phone Number</label>\n");
      out.write("    <input type=\"number\" readonly=\"\"  class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
      out.print(phone );
      out.write("\">\n");
      out.write("      <input type=\"hidden\" name=\"id\" class=\"form-control\" id=\"exampleInputPassword1\" value=\"");
      out.print(id );
      out.write("\" >\n");
      out.write("        <input type=\"hidden\" name=\"phone\" class=\"form-control\" id=\"exampleInputPassword1\" value=\"");
      out.print(phone );
      out.write("\" >\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Time Slot</label>\n");
      out.write("    <input type=\"text\" name=\"time\" class=\"form-control\" id=\"exampleInputPassword1\" readonly value=\"");
      out.print(time );
      out.write("\">\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary float-right\">Reserve</button>\n");
      out.write("</form>\t\t\n");
      out.write("  </div>\n");
      out.write("</div></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
