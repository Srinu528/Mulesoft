package MuleSoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class movies_insert {
	public static void main(String[] args)
	{
		try
		{
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","system","7474");
			System.out.println("connection established");
			Statement stmt = con.createStatement();
			
			for(int i=1;i<=2;i++)
			{
             PreparedStatement ps=con.prepareStatement("insert into movies values (?,?,?,?,?,?)");

			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Movie Name:");
			String  movie = sc.next();
			System.out.println("Enter Actor:");
			String actor = sc.next();
			System.out.println("Enter Actress:");
			String actress = sc.next();
			System.out.println("Enter Director:");
			String director = sc.next();
			System.out.println("Enter Year:");
			String year = sc.next();
			System.out.println("Enter Budget:");
			String budget= sc.next();
			
			
			ps.setString(1,movie);
			ps.setString(2,actor);
			ps.setString(3,actress);
			ps.setString(4,director);
			ps.setString(5,year);
			ps.setString(6,budget);
			ps.executeUpdate();
					
			}
			System.out.println("Record is inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

