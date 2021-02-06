package poo.consultorio.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoConsultorioFabrica {
	
	public static Connection getConexao() {
		try {
		Class.forName("org.hsqldb.jdbc.JDBCDriver");
		return DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/clinicamedicadb","sa","");
		} catch (ClassNotFoundException | SQLException e) {
			throw new  RuntimeException(e);
		}
	}
}