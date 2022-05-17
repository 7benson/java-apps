package com.dbms.operations;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection conn;
	public static Connection getConnection() {
		String jdbcUrl="jdbc:postgresql://localhost:5432/students_dbms";
		String userName="postgres";
		String password="root";
		try {
			conn=DriverManager.getConnection(jdbcUrl,userName,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
