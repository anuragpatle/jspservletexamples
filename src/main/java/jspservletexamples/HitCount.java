package jspservletexamples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class HitCount extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		HttpSession session = req.getSession(); // this is how to get a session object

		Integer hitNumber = (Integer) session.getAttribute("rama"); // retrieving value from session object

		if (hitNumber == null) {
			hitNumber = new Integer(1);
		} else {
			hitNumber = new Integer(hitNumber.intValue() + 1);
		}

		session.setAttribute("rama", hitNumber); // storing the value with session object

		out.println("Your Session ID:  " + session.getId()); // never changes in the whole session

		out.println("<br>Session Creation Time: " + new Date(session.getCreationTime())); // never changes in the whole
																							// session

		out.println("<br>Time of Last Access: " + new Date(session.getLastAccessedTime())); // changes for every hit

		out.println("<br>Latest Hit Count: " + hitNumber); // increments by 1 for every hit
	}
}