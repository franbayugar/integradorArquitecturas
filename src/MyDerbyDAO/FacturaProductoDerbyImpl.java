package MyDerbyDAO;

import java.util.List;

import Connection.ConexionDerby;
import Interface.DAOFacturaProducto;
import Modelo.FacturaProducto;

public class FacturaProductoDerbyImpl extends ConexionDerby implements DAOFacturaProducto{

	@Override
	public void createFacturaProducto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertFacturaProducto(int idFactura, int idProducto, int cantidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FacturaProducto> detalleFactura(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
