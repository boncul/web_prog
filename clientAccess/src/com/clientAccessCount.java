package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class clientAccessCount
 */
@WebServlet("/clientAccessCount")
public class clientAccessCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientAccessCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String countString = cookieUtilities.getCookieValue(request, "sayi", "1");
		int count = 1;
		try {
			count =Integer.parseInt(countString);
		} catch(NumberFormatException nfe) { }

		longLivedCookie c = new longLivedCookie("sayi", String.valueOf(count + 1));
		response.addCookie(c);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Tiklama Analizi";
		String head = "<!DOCTYPE>";
		out.println(head +
					"<HTML>" +
					"<HEAD><TITLE>" + title + "</TITLE></HEAD>" +
					"<BODY BGCOLOR=\"#F1F2F3\">" +
					"<CENTER>" +
					"<H1>" + title + "</H1>" +
					"<H2>Bu sayfa, bu tarayici ile " +
					count + " defa acilmistir. </H2>" +
					"</CENTER></BODY></HTML>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
