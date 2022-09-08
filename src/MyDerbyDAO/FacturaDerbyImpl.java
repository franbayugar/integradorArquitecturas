package MyDerbyDAO;

import java.util.List;

import Connection.ConexionDerby;
import Interface.DAOCliente;
import Interface.DAOFactura;
import Interface.DAOFacturaProducto;
import Interface.DAOProducto;

public class FacturaDerbyImpl extends ConexionDerby implements DAOFactura{

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

}
