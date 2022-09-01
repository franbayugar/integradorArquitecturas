package Interface;

import java.util.List;

public interface DAOProducto {
	public List<DAOProducto> selectProductos();
	
	public void createProducto();
	// se incorpora derecho en BBDD
	public void insertProducto(String name, float value);

	public DAOFactura getProducto(int idProducto);
	
	public DAOProducto getMayorRecaudacion();
}
