import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcClass {

	public static void main(String[] args) {
		try {
			
		String host="localhost";
		String port="3306";		 
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/devops", "root", "Bharathi@1612");
		System.out.println("Connection is successful");
     	Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from worker");
        while(rs.next()) {
		System.out.print("The first name is: "+rs.getString("first_name")+",	The department is: "+rs.getString("department"));
		System.out.println();
        }}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
