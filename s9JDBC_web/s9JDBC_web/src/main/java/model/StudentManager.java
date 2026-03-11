package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentManager {
	String url = "jdbc:mysql://localhost:3306/s9fsad";
	String un = "root";
	String pwd = "Pwd1@3";
	
	public String addStudent(Student S) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, un, pwd);
		String qry = "insert into student values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(qry);
		ps.setInt(1, S.getId());
		ps.setString(2, S.getName());
		ps.setString(3, S.getDept());
		ps.execute();
		con.close();
		return "Record Inserted....";
	}

}
