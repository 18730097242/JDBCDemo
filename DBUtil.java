package com.azf.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {	
	Connection conn = DBUtil.open();
	String sql = "select id,name,email from clazzTb";
	
	try {
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	
	//cursor
	while(rs.next()) {
		int id = rs.getInt(1);
		String name = rs.getString(2);
		String email = rs.getString(3);
		System.out.println(id+","+name+","+email);
		}
	}catch(SQLException e) {
		e.printStackTrace();
		}
	}
	}
