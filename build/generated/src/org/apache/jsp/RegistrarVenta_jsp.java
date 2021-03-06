package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarVenta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .form-group,.form-control {\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registrar Venta</h1>\n");
      out.write("        <div class=\"d-flex\" >\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <div class=\"form group\">\n");
      out.write("                        <label>Datos del Cliente</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group d-flex\" >\n");
      out.write("                        <div class=\"col-sm-6 d-flex\" >\n");
      out.write("                            <input type=\"text\" name=\"codigocliente\" class=\"form-control\" placeholder=\"Codigo\">\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Buscar\" class=\"btn btn-outline-info\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" name=\"nombrescliente\" class=\"form-control col-sm-60\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Datos producto</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group d-flex\">\n");
      out.write("                        <div class=\"col-sm-6 d-flex\">\n");
      out.write("                            <input type=\"text\" name=\"codigocliente\" class=\"form-control\" placeholder=\"Codigo\">\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Buscar\" class=\"btn btn-outline-info\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" name=\"nombrescliente\" class=\"form-control col-sm-60\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group d-flex\">\n");
      out.write("                        <div class=\"col-sm-6 d-flex\">\n");
      out.write("                            <input type=\"text\" name=\"precio\" class=\"form-control\" placeholder=\"Codigo\">\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Buscar\" class=\"btn btn-outline-info\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <input type=\"number\" name=\"cant\" class=\"form-control col-sm-60\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <input type=\"text\" name=\"stock\" class=\"form-control col-sm-60\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js\" integrity=\"sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js\" integrity=\"sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc\" crossorigin=\"anonymous\"></script>\n");
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
