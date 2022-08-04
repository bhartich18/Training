package com.globallogic.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnectivity {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/db";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			
			String insertQuery="insert into employees(emp_id, emp_name, job_name, manager_id, hire_date, salary, dep_id) VALUES(69845,'KIM','MINISTER', 69767, '1995-06-08',2900.00,6001)";
			st.execute(insertQuery);
			String insertQuery2="insert into employees(emp_id, emp_name, job_name, manager_id, hire_date, salary, dep_id) VALUES(69885,'jiM','MINISTER', 69000, '1995-06-10',3900.00,6901)";
			st.execute(insertQuery2);

	
			
			//delete the employees whose id=
			String deleteQuery="delete from employees where emp_id=69885";
			st.executeUpdate(deleteQuery);
			
			//delete query ends
			
			
			String updateQuery="update employees set salary=50001 where emp_id=69845";
			st.executeUpdate(updateQuery);
			
			//update query ends
			
			
			// Select using executeQuery
						String query = "select * from employees";
						
						ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				//rs.getint() 
				    //pass the index 
				    //pass the columnname
				System.out.println("emp_id : "+" "+rs.getInt("emp_id") +" emp_name : "+rs.getString(2) +" jobname :  "+rs.getString(3)+ "manager_id : "+rs.getInt("manager_id") + "Date: "+rs.getDate("hire_date")+" salary : "+rs.getDouble(6)+"dep_id"+rs.getInt("dep_id"));
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}


