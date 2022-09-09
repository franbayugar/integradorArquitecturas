package Factories;

import Interface.DAOCliente;
import Interface.DAOFactura;
import Interface.DAOFacturaProducto;
import Interface.DAOProducto;

public abstract class FactoryDB {
private final static String MySQL = "MySQL";
private final static String Derby = "Derby";

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

	public abstract DAOCliente getDAOCliente();
	public abstract DAOFactura getDAOFactura();
	public abstract DAOProducto getDAOProducto();
	public abstract DAOFacturaProducto getDAOFacturaProducto();
}