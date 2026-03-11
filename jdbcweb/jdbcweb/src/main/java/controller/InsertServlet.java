package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import model.StudentManager;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("T1"));
		String name = request.getParameter("T2");
		String dept = request.getParameter("T3");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		try
		{
			Student S = new Student(id, name, dept);
			StudentManager SM = new StudentManager();
			String ack = SM.insertData(S);
			pw.print(ack);
		}catch (Exception e) 
		{
			pw.print(e.getMessage());
		}
		
		RequestDispatcher RD = request.getRequestDispatcher("index.jsp");
		RD.include(request, response);
	}

}
