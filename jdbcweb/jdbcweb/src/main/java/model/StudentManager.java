package model;

import java.sql.*;
public class StudentManager {

	String url = "jdbc:mysql://localhost:3306/s57fsad";
	String un = "root";
	String pwd = "Pwd1@3";
	
	public String insertData(Student S) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, un, pwd);
		String qry = "insert into student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(qry);
		
		ps.setInt(1, S.getId());
		ps.setString(2, S.getName());
		ps.setString(3, S.getDept());
		
		ps.execute();
					
		con.close();
		
		return "Data has been inserted successfully";
	}	
}
