package Modelo;

public class Cliente {
	private int idCliente;
	private String name;
	private String email;
	
	public Cliente(int idCliente, String name, String email) {
		this.idCliente = idCliente;
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdCliente() {
		return idCliente;
	}
	
	

}
