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
 * Servlet implementation class registrationServlet
 */
@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean isMissingValue = false;
		String firstName = request.getParameter("firstName");
		if (isMissing(firstName)) {
			firstName = "Missing first name";
			isMissingValue = true;
		}
		String lastName = request.getParameter("lastName");
		if (isMissing(lastName)) {
			lastName = "Missing last name";
			isMissingValue = true;
		}
		String emailAdress = request.getParameter("emailAdress");
		if (isMissing(emailAdress)) {
			emailAdress = "Missing email adress";
			isMissingValue = true;
		}
		
		Cookie c1 = new longLivedCookie("firstName", firstName);
		response.addCookie(c1);
		Cookie c2 = new longLivedCookie("lastName", lastName);
		response.addCookie(c2);
		Cookie c3 = new longLivedCookie("emailAdress", emailAdress);
		response.addCookie(c3);
		
		String formAddress = "/RegistrationForm/RegistrationForm";
		if (isMissingValue) {
			response.sendRedirect(formAddress);
		}
		else {
			PrintWriter out = response.getWriter();
			String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n";
			String title = "Thanks for Registering";
			out.println
			(docType +
					"<HTML>\n" +
					"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
					"<BODY BGCOLOR=\"#FDF5E6\">\n" +
					"<CENTER>\n" +
					"<H1 ALIGN>" + title + "</H1>\n" +
					"<UL>\n" +
					" <LI><B>First Name</B>: " + firstName + "\n" +
					" <LI><B>Last Name</B>: " + lastName + "\n" +
					" <LI><B>Email address</B>: " + emailAdress + "\n" +
					"</UL>\n" +
					"</CENTER></BODY></HTML>");
		}
	}
	/** Determines if value is null or empty. */
	private boolean isMissing(String param) {
		return((param == null) || (param.trim().equals("")));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
