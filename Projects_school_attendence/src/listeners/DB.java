package listeners;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.schoolapp.db.DBConnectionManager;


public class DB implements ServletContextListener {

    
    public DB() {
        // TODO Auto-generated constructor stub
    }

    public void contextInitialized(ServletContextEvent event) {

		try {
			Connection con = DBConnectionManager.getConnection("oracle.jdbc.driver.OracleDriver",
					"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			// storing connection object as an attribute in ServletContext

			//for admin table creation
			String query1 = "select * from tab";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query1);

			int count = 0;
			while (rs.next()) {
				if (rs.getString(1).equalsIgnoreCase("admin")) {
					count = 1;
					break;
				}
			}

			System.out.println("Count: " + count);
			if (count == 1) {
				System.out.println("admin table already exist");
			} else {
				String q2 = "create table admin(uname  varchar2(50), password number(10))";
				int i = stmt.executeUpdate(q2);
				System.out.println(i +" :faculty table created successfully");
			}
			
			//for faculty table creation
			String query2 = "select * from tab";
			Statement st2 = con.createStatement();
			ResultSet rs2 = st2.executeQuery(query2);

			int count2 = 0;
			while (rs2.next()) {
				if (rs2.getString(1).equalsIgnoreCase("faculty")) {
					count2 = 1;
					break;
				}
			}

			System.out.println("Count: " + count2);
			if (count2 == 1) {
				System.out.println("faculty table already exist");
			} else {
				String q3 = "create table faculty(uname  varchar2(50), password number(10))";
				int i2= st2.executeUpdate(q3);
				System.out.println(i2+" : faculty table created successfully");
			}
			
			
			//for student table creation
			String query3 = "select * from tab";
			Statement st3 = con.createStatement();
			ResultSet rs3 = st3.executeQuery(query3);

			int count3 = 0;
			while (rs2.next()) {
				if (rs2.getString(1).equalsIgnoreCase("student")) {
					count3 = 1;
					break;
				}
			}
			System.out.println("Count: " + count3);
			if (count3 == 1) {
				System.out.println("student table already exist");
			} else {
				String q = "create table student(uname  varchar2(50), password number(10))";
				int i3 = st3.executeUpdate(q);
				System.out.println(i3 +" : student table created successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void contextDestroyed(ServletContextEvent arg0) {
	}
}
