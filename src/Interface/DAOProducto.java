package Interface;

import java.util.List;

import Modelo.Producto;

public interface DAOProducto {
	public List<Producto> selectProductos();
	
	public void createProducto();
	// se incorpora derecho en BBDD
	public void insertProducto(String name, float value);

	public Producto getProducto(int idProducto);
	
	public Producto getMayorRecaudacion();
}
