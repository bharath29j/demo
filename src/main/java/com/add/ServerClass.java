package com.add;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerClass
 */
@WebServlet("/ABC")
public class ServerClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String first = request.getParameter("firstname");
		String last = request.getParameter("pass");
//		String[] day = request.getParameterValues("day");
//		String[] month = request.getParameterValues("month");
//		String[] year = request.getParameterValues("Year");
//		
//		System.out.println(first);
//		System.out.println(last);	
//		for (String printday1 : day) {
//			System.out.println(printday1);
//		}
//		for (String printmonth1 : month) {
//			System.out.println(printmonth1);
//		}
//		for (String printyear : year) {
//			System.out.println(printyear);
//		}
//		String gen = request.getParameter("gender");
//		System.out.println(gen);
//		String[] hobbies = request.getParameterValues("hobbies");
//		for (String hobbieprint :hobbies) {
//			System.out.println(hobbieprint);
//		}
//		String emailadd = request.getParameter("email");
//		System.out.println(emailadd);
//		
//		String contactprint = request.getParameter("number1");
//		System.out.println(contactprint);
//		
//		String password = request.getParameter("pass");
//		System.out.println(password);
		
//		PrintWriter w = response.getWriter();
//		if (first.equals("bharath")&&last.equals("bh29")) {
//			w.println("welcome to login page");
//		} else {
//            w.println("invalid user");
//		}
		
//		
//		if (first.equals("bharath")&&last.equals("bh29")) {
//			request.getRequestDispatcher("SucessPage.jsp").forward(request, response);
//		} else {
//            request.getRequestDispatcher("ErrorPage.jsp").forward(request, response);
//		}
		Greens a=new Greens();
		a.setCourse("FullStack");
		a.setFees("30000");
		
		request.setAttribute("encap", a);
		
	}

}
