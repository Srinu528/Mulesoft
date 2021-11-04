package MuleSoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_table {
	public static void main(String[] args)
	{
		try
		{
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","system","7474");
			System.out.println("connection established");
			String query = "create table movies(movie varchar(30) not null,actor varchar(20) not null,actress varchar(20) not null,director varchar(20) not null, year varchar(20) not null, budget varchar(20))";
			Statement stmt = con.createStatement() ;
			stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
