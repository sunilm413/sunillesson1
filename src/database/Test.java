package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import database.Product;


public class Test {
	
	public static void sum() {


		Product product =new Product(80,"mac56",899800,909);
	
     try{
 			
			//Step1 : Load JDCB Drivers
			Class.forName("org.gjt.mm.mysql.Driver");
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//Step2 : Establish the connection
			                              // connection url             // username, password
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
			
			//Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:sid","root","root");
			
			//Connection connection =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks","root","root");
			
			
			//Step3 : Construct query
			String insertQuery = "insert into emp(empid,empname,salary,dept) "
					+ "values(?,?,?,?)";
			                //1,2,3,4
			//String selectquery="select * From emp";
			//Step4 : create statement object to execute the query
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			//Statement statement = connection.createStatement();
			//ResultSet resultSet = statement.executeQuery(selectquery);
			//Step5 : Execute the query using statement object
			int i = statement.executeUpdate();
			statement.setInt(1, product.getId());
			statement.setString(2,product.getName());
			statement.setInt(3, product.getSalary());
			statement.setInt(4, product.getDept());
			//int i=statement.executeUpdate();
		
			
			if(i == 1){
				System.out.println("Record is added successfully");
			}
/*while(resultSet.next()){
				
				System.out.println("ProductId   : "+resultSet.getInt("empid"));
				System.out.println("ProductName : "+resultSet.getString("empname"));
				System.out.println("ProductDesc : "+resultSet.getInt("salary"));
				System.out.println("ProductPrice : "+resultSet.getInt("dept"));
				System.out.println("*********************");
			}
			
			resultSet.close();*/
			
			connection.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}


	}


public static void main(String[] args) {

	Test.sum();
}
}