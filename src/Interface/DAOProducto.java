package Interface;

import java.util.List;

public interface DAOProducto {
	public List<DAOProducto> selectProductos();
	
	// se incorpora derecho en BBDD
	public void createProducto(String name, float value);

	public DAOFactura getProducto(int idProducto);
	
	public DAOProducto getMayorRecaudacion();
}
