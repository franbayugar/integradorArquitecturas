package Interface;

import java.util.List;

public interface DAOFactura {
	public List<DAOFactura> selectFacturas();
	
	// se incorpora derecho en BBDD
	public void createFactura(int idFactura, int idCliente);

	public DAOFactura getFactura(int idFactura);
	
}
