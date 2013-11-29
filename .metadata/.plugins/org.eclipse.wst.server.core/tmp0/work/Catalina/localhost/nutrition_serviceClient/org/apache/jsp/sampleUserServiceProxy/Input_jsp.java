package org.apache.jsp.sampleUserServiceProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Input_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Inputs</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Inputs</H1>\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 5:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">endpoint:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"endpoint8\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 10:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 13:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">email:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"email16\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">password:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"password18\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 20:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">user:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">id:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"id25\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">language:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">description:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"description29\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">id:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"id31\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">firstname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"firstname33\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">lastname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"lastname35\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">email:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"email37\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">birthday:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"birthday39\" SIZE=20></TD>\r\n");

java.text.DateFormat dateFormatbirthday39 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampbirthday39  = new java.util.GregorianCalendar();
java.util.Date datebirthday39 = gcExampbirthday39.getTime();
String tempResultbirthday39 = dateFormatbirthday39.format(datebirthday39);

      out.write("\r\n");
      out.write("<TD ALIGN=\"left\">\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD> </TD>\r\n");
      out.write("<TD ALIGN=\"left\"> eg. ");
      out.print( tempResultbirthday39 );
      out.write(" </TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">password:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"password41\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 43:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 46:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">user:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">id:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"id51\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">language:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">description:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"description55\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">id:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"id57\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">firstname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"firstname59\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">lastname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"lastname61\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">email:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"email63\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">birthday:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"birthday65\" SIZE=20></TD>\r\n");

java.text.DateFormat dateFormatbirthday65 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampbirthday65  = new java.util.GregorianCalendar();
java.util.Date datebirthday65 = gcExampbirthday65.getTime();
String tempResultbirthday65 = dateFormatbirthday65.format(datebirthday65);

      out.write("\r\n");
      out.write("<TD ALIGN=\"left\">\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD> </TD>\r\n");
      out.write("<TD ALIGN=\"left\"> eg. ");
      out.print( tempResultbirthday65 );
      out.write(" </TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">password:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"password67\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111111:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">URLString:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"url1111111111\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111112:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
}
if (valid) {

      out.write("\r\n");
      out.write("Select a method to test.\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
