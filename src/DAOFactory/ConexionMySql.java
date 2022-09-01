package DAOFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySql implements DAOConexion {
	
	private Connection conexion; 	
	private String uri = "jdbc:mysql://localhost:3306/bataman";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String user = "root";
	private String password = "root";
		
	public ConexionMySql() {
		this.conexion=null;
	}
	
	@Override
	public Connection getInstance() {
		 if (conexion==null) connect();			  	 
		 return this.conexion;
	}

	@Override
	public void connect() {		
		   try {
			this.conexion = DriverManager.getConnection(this.uri, this.user, this.password);
		   }
		   catch (SQLException e) {				
			e.printStackTrace();
		}  		
		
	}

	@Override
	public void disconnect() {
		try {
			this.conexion.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}	
	
}
