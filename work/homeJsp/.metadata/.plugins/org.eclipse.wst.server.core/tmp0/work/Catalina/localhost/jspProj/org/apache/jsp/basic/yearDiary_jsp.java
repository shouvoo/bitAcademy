/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2017-09-27 01:25:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.basic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import java.util.Calendar;

public final class yearDiary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("org.apache.jasper.tagplugins.jstl.core.ForEach");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

	Calendar today = Calendar.getInstance();

	SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
	String now = sdf.format(today.getTime());
	
String [][] cc = {
		{"#f00","#fff","#fff","#fff","#fff","#fff","#00f"},
		{"","#f00","000","000","000","000","000","#00f"},
		{"#fff","000","000","000","000","000"}};

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t");
 for(int m =0; m<12;m++) {
		today.set(today.get(Calendar.YEAR), m, 1);
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<td valign=\"top\">\r\n");
      out.write("\t\t<table border=1>\r\n");
      out.write("\t<tr height=\"10\">\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"7\">\r\n");
      out.write("\t\t\t<img alt=\"\" src=\"../img/diary/");
      out.print(m );
      out.write(".jpeg\" height=200>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr height=\"10\">\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"7\" style=\"font-size: 20px\">\r\n");
      out.write("\t\t\t");
      out.print(today.get(Calendar.YEAR) );
      out.write(' ');
      out.write('년');
      out.write(' ');
      out.print(today.get(Calendar.MONTH)+1 );
      out.write(" 월\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr height=\"10\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");

			String sss = "일월화수목금토";
			for(int i =0; i<sss.length();i++ ){
		
		
      out.write("\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"");
      out.print(cc[0][i] );
      out.write("\" \r\n");
      out.write("\t\tstyle=\"color: ");
      out.print(cc[2][i%6]);
      out.write('"');
      out.write('>');
      out.print(sss.charAt(i) );
      out.write("</td>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr height=\"10\" align=\"right\">\r\n");
      out.write("\t\t");

		
		today.set(Calendar.DATE,1);
		
		int cnt = today.get(Calendar.DAY_OF_WEEK)-1;
		
		if(cnt>0){
			
      out.write("\r\n");
      out.write("\t\t\t<td colspan=\"");
      out.print(cnt);
      out.write("\"></td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
}for(int i =1; i<=today.getActualMaximum(Calendar.DATE);i++) {
			today.set(Calendar.DATE,i);
			int day=today.get(Calendar.DAY_OF_WEEK);
			
			String bg = "#fff";
			
			if(now.equals(sdf.format(today.getTime())))
				bg = "#ff0";
			
		
      out.write("\r\n");
      out.write("\t\t<td bgcolor=\"");
      out.print(bg );
      out.write("\" style=\"color: ");
      out.print(cc[1][day]);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</td>\r\n");
      out.write("\t\t");

			
		
			if(day==7){
				out.print("</tr><tr  align='right'>");
			}
		
		} 
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

	
	if((m+1)%3==0){
			out.print("</tr><tr>");
		}
	
	} 
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
