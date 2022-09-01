package Interface;

import java.util.List;

public interface DAOFacturaProducto {
	public void createFacturaProducto(int idFactura, int idProducto);
	
	public List<DAOFacturaProducto> detalleFactura(int id);	
		
}
