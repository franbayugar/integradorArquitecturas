package Interface;

import java.util.List;

import Modelo.Cliente;

public interface DAOCliente {
	public List<Cliente> selectClientes();
	
	public void createCliente();
	
	// se incorpora derecho en BBDD
	public void insertCliente(String name, String mail);

	public DAOCliente getCliente(int id);
	
	public DAOCliente getClienteByName(String name);
	
	public DAOCliente getClienteByMail(String mail);
	
	public List<DAOCliente> getRankingFacturacion();


}
