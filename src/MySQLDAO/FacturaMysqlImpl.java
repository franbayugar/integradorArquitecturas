package MySQLDAO;

import java.util.List;

import Connection.ConexionMySql;
import Interface.DAOCliente;
import Interface.DAOFactura;
import Interface.DAOFacturaProducto;
import Interface.DAOProducto;

public class FacturaMysqlImpl extends ConexionMySql implements DAOFactura{

	@Override
	public List<DAOFactura> selectFacturas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createFactura() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertFactura(int idFactura, int idCliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DAOFactura getFactura(int idFactura) {
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
