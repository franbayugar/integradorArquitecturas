package Interface;

import java.util.List;

public interface DAOCliente {
	public List<DAOCliente> selectClientes();
	
	// se incorpora derecho en BBDD
	public void createCliente(String name, String mail);

	public DAOCliente getCliente(int id);
	
	public DAOCliente getClienteByName(String name);
	
	public DAOCliente getClienteByMail(String mail);
	
	public List<DAOCliente> getRankingFacturacion();


}
