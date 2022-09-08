package MyDerbyDAO;

import java.util.List;

import Connection.ConexionMySql;
import Interface.DAOCliente;
import Interface.DAOFactura;
import Interface.DAOFacturaProducto;
import Interface.DAOProducto;
import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;

public class ProductoDerbyImpl extends ConexionMySql implements DAOProducto{

	@Override
	public List<Producto> selectProductos() {
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
	public Producto getMayorRecaudacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getProducto(int idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
