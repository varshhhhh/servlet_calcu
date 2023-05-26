package calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mul")
public class Multiplication extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number1=Integer.parseInt(req.getParameter("number1"));
		int number2=Integer.parseInt(req.getParameter("number2"));
		resp.getWriter().print("number1*number2=    "+(number1*number2));
	}
	
}