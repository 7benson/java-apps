package com.dbms.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.dbms.operations.DBConnection;
import com.dbms.operations.Student;
import com.dbms.operations.StudentDao;

public class App {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		DBConnection.getConnection();
		
		while(true) {
			System.out.println("print 1 to insert into students table");
			System.out.println("print 2 to delete a student");
			System.out.println("print 3 to view students table");
			System.out.println("print 4 to quit");
			System.out.println("print 5 to update");
			
			int c=Integer.parseInt(buf.readLine());
			
			if(c==1) {
				System.out.println("Enter student name :");
				String name=buf.readLine();
				
				System.out.println("Enter student phone number :");
				String phone=buf.readLine();
				
				System.out.println("Enter student city :");
				String city=buf.readLine();
				
				Student st=new Student(name,phone,city);
				System.out.println(st);
				Boolean succ=StudentDao.insertStudent(st);
				if(succ) {
					System.out.println("inserted successfuly");
				}else {
					System.out.println("failed");
				}
				
			}else if(c==2) {
				System.out.println("Enter the sid you want to delete");
				int sid=Integer.parseInt(buf.readLine());
				
				Boolean success=StudentDao.deleteStudent(sid);
				if(success) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("Operation Failed");
				}
			}else if(c==3) {
				
				StudentDao.viewStudents();
				
			}else if(c==4){
				break;
			}else if(c==5){
				System.out.println("Enter the sid you want to update :");
				int sid=Integer.parseInt(buf.readLine());

				System.out.println("Enter updated name :");
				String name=buf.readLine();
				System.out.println("Enter updated phone :");
				String sphone=buf.readLine();
				System.out.println("Enter updated city :");
				String city=buf.readLine();
				
				Student st=new Student(sid,name,sphone,city);
				
				Boolean success=StudentDao.updateStudent(st);
				if(success) {
					System.out.println("updated successfully");
				}else {
					System.out.println("Operation Failed");
				}
			}else {
				System.out.println("wrong input");
			}
		}
	}

}
