package br.com.database;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class BD {
	
	private static final String USER="root";
	private static final String SENHA="root";
	private static String URL="jdbc:mysql://localhost/java";
	
	protected Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao= (Connection) DriverManager.getConnection(URL,USER,SENHA);
		return conexao;
		
	}

}
