package com;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class visit
 */
@WebServlet("/visit")
public class visit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public visit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean newbie = true;
		Cookie[] cookies = request.getCookies();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n";
		out.println(docType +
				"<HTML>\n" +
				"<HEAD></HEAD>\n" +
				"<BODY BGCOLOR=\"#FDF5E6\" style='width: 750px; margin: 0 auto;' >\n");
		out.println("<center>");
		for(int i=0; i<3; i++) {
			// Default maxAge is -1, indicating cookie
			// applies only to current browsing session.
			Cookie cookie = new Cookie("Session-Cookie-" + i,
					"Cookie-Value-S" + i);
			response.addCookie(cookie);
			cookie = new Cookie("Persistent-Cookie-" + i,
					"Cookie-Value-P" + i);
			// Cookie is valid for an hour, regardless of whether
			// user quits browser, reboots computer, or whatever.
			cookie.setMaxAge(3600);
			response.addCookie(cookie);
		}

		if (cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie c = cookies[i];

				if ((c.getName().equals("repeatVisitor")) && (c.getValue().equals("yes"))) {
					newbie = false;
					break;
				}
			}
		}
		String title;
		if (newbie) {
			Cookie returnVisitorCookie = new Cookie("repeatVisitor", "yes");
			returnVisitorCookie.setMaxAge(60*60*24*365); // 1 year
			response.addCookie(returnVisitorCookie);
			title = "Welcome Aboard";
			out.println("<TR><TH COLSPAN=2>No cookies");

		} else {
			Cookie cookie;
			out.println("<table>");
			for(int i=0; i<cookies.length; i++) {
				cookie = cookies[i];
				out.println("<TR>\n" +
						" <TD>" + cookie.getName() + "\n" + "</TD>" +
						" <TD>" + cookie.getValue() + " </TD>" +
						"</TR>");
			}
			out.println("</table>");
			title = "Welcome Back";
		}
		out.println("<center>");

		out.println(
				"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
				"</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
