package MuleSoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class retrive_movies {
	public static void main(String[] args)
	{
		try
		{
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","system","7474");
			System.out.println("connection established");
		    String query="select * from movies";
			Statement stmt = con.createStatement() ;
			ResultSet rs=stmt.executeQuery(query);
		    while(rs.next())
		         System.out.println(rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+"- "+rs.getString(4)+" - "+rs.getString(5)+" - s"+rs.getString(6));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
