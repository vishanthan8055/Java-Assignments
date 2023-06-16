package com.dal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dal.props.MyDao;

public class MyDbConnection {
	static Connection con;
	private String host="jdbc:oracle:thin:@localhost:1521:xe";
	private String uname="system";
	private String pass = "vichuroot";
    
	public Connection getMyConnection() {

		try {
			con = DriverManager.getConnection(this.host, this.uname, this.pass);
			System.out.println(con);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spr-props.xml");
		MyDbConnection dao = (MyDbConnection) context.getBean("dbconnection");
		
		System.out.println(dao.getHost() + "  " + dao.getUname() + "  " + dao.getPass());
		System.out.println(dao.getMyConnection());

	}


	
}