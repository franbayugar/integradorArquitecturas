package Interface;

import java.util.List;

public interface DAOFacturaProducto {
	
	public void createFacturaProducto();
	public void insertFacturaProducto(int idFactura, int idProducto);
	
	public List<DAOFacturaProducto> detalleFactura(int id);	
		
}
