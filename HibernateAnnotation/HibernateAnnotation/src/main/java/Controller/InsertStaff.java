package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Staff;
import model.StaffManager;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/InsertStaff")
public class InsertStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InsertStaff() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("T1");
		String dept = request.getParameter("T2");
		double salary = Double.parseDouble(request.getParameter("T3"));
		
		try {
			StaffManager SM = new StaffManager();
			Staff S = new Staff();
			S.setName(name);
			S.setDept(dept);
			S.setSalary(salary);
			pw.print(SM.addStaff(S));
			
		} 
		catch (Exception e) {
			pw.print(e.getMessage());
			// TODO: handle exception
		}
		
		RequestDispatcher RD = request.getRequestDispatcher("index.jsp");
		RD.include(request, response);
		
	}

}
