package Connection;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Factories.FactoryDB;

public class ConexionDerby  {
	
	private Connection conexion; 	
	private String uri = "jdbc:derby:MyDerbyDb;create=true";
	private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		
	public ConexionDerby() {
		this.conexion=this.getInstance();
	}
	
	
	public Connection getInstance() {
		 if (conexion==null) connect();			  	 
		 return this.conexion;
	}

	
	public void connect() {	
		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	    try {
		this.conexion = DriverManager.getConnection(this.uri);
	   }
	   catch (SQLException e) {				
		e.printStackTrace();
	}  		
		
	}

	public void disconnect() {
		try {
			this.conexion.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}	
	
}
