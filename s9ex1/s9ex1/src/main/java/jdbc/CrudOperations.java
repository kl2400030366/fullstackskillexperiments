package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/s9fsad";
		String un = "root";
		String pwd = "Pwd1@3";
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, un, pwd);
		String qry1 = "delete from student where id=2000";
		PreparedStatement ps_u = con.prepareStatement(qry1);
		ps_u.execute();
		String qry = "select * from student";
		PreparedStatement ps = con.prepareStatement(qry);
		ResultSet rs =  ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + "\n");
			
		}
		
		con.close();
		

	}

}
