package Modelo;

/**
 * Defines the attributes of the Factura entity 
 * @author fede
 *
 */
public class Factura {
	private int idFactura;
	private int idCliente;
	
	public Factura(int idFactura, int idCliente) {
		this.idFactura = idFactura;
		this.idCliente = idCliente;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public int getIdCliente() {
		return idCliente;
	}
	
	
	

}
