package Interface;

import java.util.List;

import Modelo.Cliente;

public interface DAOCliente {
	public List<Cliente> selectClientes();
	
	public void createCliente();
	
	// se incorpora derecho en BBDD
	public void insertCliente(String name, String mail);

	public Cliente getCliente(int id);
	
	public List<Cliente> getClienteByName(String name);
	
	public List<Cliente> getClienteByMail(String mail);
	
	public List<Cliente> getRankingFacturacion();


}
