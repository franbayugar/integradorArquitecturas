package Interface;

import java.util.List;

public interface DAOFactura {
	public List<DAOFactura> selectFacturas();
	
	public void createFactura();
	// se incorpora derecho en BBDD
	public void insertFactura(int idFactura, int idCliente);

	public DAOFactura getFactura(int idFactura);
	
}
