package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Titan_Bank.domain.bll.*;
import java.util.ArrayList;

public final class Accounts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Account checking;
Account savings;
Customer currentCustomer;
ArrayList<Account> accounts = currentCustomer.getAccounts();
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
 for(Account c:accounts) {
    
    if (c.getAccountType().equals(Account.AccountType.CHECKINGS)) {

        checking.equals(c);

      out.write('\n');

    }else {        
        savings.equals(c);
    }

      out.write('\n');

}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Titan Bank Accounts</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Accounts.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"homecss.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Titan Bank</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"header.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <h1>Titan Bank</h1>    \n");
      out.write("            <img src=\"blue_header.png\" alt=\"blue_banner\" id=\"blue\">\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"header_and_links\">\n");
      out.write("            <div class=\"links\">\n");
      out.write("                <a href=\"Home.jsp\" id=\"home\">Home&nbsp;</a>\n");
      out.write("                <a href=\"Accounts.jsp\" id=\"accounts\">Accounts&nbsp;</a>\n");
      out.write("                <a href=\"\" id=\"transfers\">Transfers&nbsp;</a>\n");
      out.write("                <a href=\"\" id=\"checks\">Checks&nbsp;</a>\n");
      out.write("                <a href=\"\" id=\"administrator\">Administrator&nbsp;</a>\n");
      out.write("                <a href=\"\" id=\"logout\">Logout&nbsp;</a>    \n");
      out.write("            </div>\n");
      out.write("            <img src=\"blueheader.jpg\" alt=\"blue\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"table\">\n");
      out.write("            <table> \n");
      out.write("                <tr>\n");
      out.write("                    <td>Checking:</td>\n");
      out.write("                    <td>$");
      out.print(checking.getBalance());
      out.write("0</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Savings:</td>\n");
      out.write("                    <td>$");
      out.print(savings.getBalance());
      out.write("0</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
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
