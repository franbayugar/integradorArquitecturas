package Factories;

import Interface.DAOCliente;
import Interface.DAOFactura;
import Interface.DAOFacturaProducto;
import Interface.DAOProducto;

public abstract class FactoryDB {
private final static String MySQL = "MySQL";
private final static String Derby = "Derby";

/**Obtains the connection according to the specified technology
 * @param db  the String that identifies the DB Engine
 * @return FactoryDB object
 * @see FactoryDerby class
 * @see FactorySQL class
 *
 */
public static FactoryDB getConnetion(String db) {
	switch (db) {
	case MySQL:
		return new FactoryMySQL();
	case Derby:
		return new FactoryDerby();
	default:
		return null;
	} 
} 	

/**
 * Obtains a DAOCliente object
 * @return DAOCliente
 * @see DAOCliente class
 */
	public abstract DAOCliente getDAOCliente();
	
	/**
	 * Obtains a DAOFactura object
	 * @return DAOFactura
	 * @see DAOFactura class
	 */
	public abstract DAOFactura getDAOFactura();
	
	/**
	 * Obtains a DAOProducto object
	 * @return DAOProducto
	 * @see DAOProducto class
	 */
	public abstract DAOProducto getDAOProducto();
	
	/**
	 * Obtains a DAOFacturaProducto object
	 * @return AOFacturaProducto
	 * @see AOFacturaProducto class
	 */
	public abstract DAOFacturaProducto getDAOFacturaProducto();
}