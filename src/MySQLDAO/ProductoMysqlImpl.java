package MySQLDAO;

import java.util.List;

import Connection.ConexionMySql;
import Interface.DAOCliente;
import Interface.DAOFactura;
import Interface.DAOFacturaProducto;
import Interface.DAOProducto;

public class ProductoMysqlImpl extends ConexionMySql implements DAOProducto{

	@Override
	public List<DAOProducto> selectProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProducto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertProducto(String name, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DAOFactura getProducto(int idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAOProducto getMayorRecaudacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAOCliente getDAOCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAOFactura getDAOFactura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAOProducto getDAOProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAOFacturaProducto getDAOFacturaProducto() {
		// TODO Auto-generated method stub
		return null;
	}

}
