package MySQLDAO;

import java.util.List;

import Connection.ConexionMySql;
import Interface.DAOFactura;
import Modelo.Factura;

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
	public Factura getFactura(int idFactura) {
		// TODO Auto-generated method stub
		return null;
	}


}
