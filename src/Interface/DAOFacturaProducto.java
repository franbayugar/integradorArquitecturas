package Interface;

import java.util.List;

import Modelo.FacturaProducto;

public interface DAOFacturaProducto {
	
	public void createFacturaProducto();
	public void insertFacturaProducto(int idFactura, int idProducto);
	
	public List<FacturaProducto> detalleFactura(int id);	
		
}
