package Interface;

import java.util.List;

import Modelo.Producto;

public interface DAOProducto {
	
	/**
	 * Gets the list of all Producto records.   
	 * @return ArrayList of Producto.
	 */
	public List<Producto> selectProductos();
	
	/**
	 * Create a table Producto.
	 */
	public void createProducto();
	
	
	/**
	 * Insert a new record Producto in the table.
	 * @param id the Producto identifier. 
	 * @param name the Producto name.
	 * @param value the Producto value.
	 */
	public void insertProducto(int id, String name, float value);

	
	/**
	 * Gets a Producto by ID
	 * @param idProducto   the Producto identification number. 
	 * @return Producto
	 */
	public Producto getProducto(int idProducto);
	
	
	/**
	 * Gets the highest grossing Producto.   
	 * @return Producto
	 */
	public Producto getMayorRecaudacion();
}
