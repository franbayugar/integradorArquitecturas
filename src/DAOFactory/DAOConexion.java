package DAOFactory;

import java.sql.Connection;

public interface DAOConexion {
	
	public Connection getInstance();
	
	public void connect();
	
	public void disconnect();

}
