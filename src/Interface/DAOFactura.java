package Interface;

import java.util.List;

import Modelo.Factura;

public interface DAOFactura {
	
	/**
	 * Gets the list of all Factura records.   
	 * @return ArrayList of Factura.
	 */
	public List<Factura> selectFacturas();
	
	
	/**
	 * Create a table Factura.
	 */
	public void createFactura();
	
	
	/**
	 * Insert a new record Factura in the table.
	 * @param idFactura the Factura identifier. 
	 * @param idCliente the Cliente identifier.
	 */
	public void insertFactura(int idFactura, int idCliente);

	
	/**
	 * Obtains the Factura whit specified id.
	 * @param idFactura the Factura identifier.	  
	 */
	public Factura getFactura(int idFactura);
	
}
