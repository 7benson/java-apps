package com.dbms.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static Boolean insertStudent(Student st) {
		Boolean success=false;
		try {
			Connection conn=DBConnection.getConnection();
			String cmd="insert into students(sname,sphone,scity) values(?,?,?)";
			PreparedStatement s=conn.prepareStatement(cmd);
			s.setString(1, st.getSname());
			s.setString(2, st.getSphone());
			s.setString(3, st.getScity());
			
			s.execute();
			success=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

	public static Boolean deleteStudent(int sid) {
		Boolean success=false;
		try {
			Connection conn=DBConnection.getConnection();
			String cmd="delete from students where sid=?";
			PreparedStatement stmt=conn.prepareStatement(cmd);
			stmt.setInt(1,sid);
			stmt.execute();
			success=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

	public static void viewStudents() {
		try {
			Connection conn=DBConnection.getConnection();
			String q="select * from students";
			Statement stmt=conn.createStatement();
			ResultSet res=stmt.executeQuery(q);
			
			while(res.next()) {
				System.out.println("sid : "+res.getInt(1));
				System.out.println("sname : "+res.getString(2));
				System.out.println("sphone : "+res.getString(3));
				System.out.println("scity : "+res.getString(4));
				System.out.println("--------------------------");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Boolean updateStudent(Student st) {
		Boolean success=false;
		try {
			Connection conn = DBConnection.getConnection();
			String cmd="update students sname=?,sphone=?,scity=? where sid=?";
			PreparedStatement stmt=conn.prepareStatement(cmd);
			stmt.setString(1, st.getSname());
			stmt.setString(2, st.getSphone());
			stmt.setString(3, st.getScity());
			stmt.setInt(4, st.getSid());
			stmt.execute();
			success=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}
}
