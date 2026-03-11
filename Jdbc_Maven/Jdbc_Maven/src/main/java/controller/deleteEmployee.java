package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.EmployeeManager;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/deleteEmployee")
public class deleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int empid = Integer.parseInt(request.getParameter("T1"));
		
		
		try {
			
			EmployeeManager EM = new EmployeeManager();
			String ack = EM.deleteData(empid);
			pw.print(ack);
		} 
		catch (Exception e) {
			pw.print(e.getMessage());
		}
		
		RequestDispatcher RD = request.getRequestDispatcher("Delete.jsp");
		RD.include(request, response);
	}

}
