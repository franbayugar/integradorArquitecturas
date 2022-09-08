package MySQLDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.ConexionMySql;
import Interface.DAOCliente;
import Modelo.Cliente;

public class ClienteMysqlImpl extends ConexionMySql implements DAOCliente{
	

	@Override
	public List<Cliente> selectClientes() {
		List<Cliente> listadoClientes = new ArrayList<>();
		String select = "SELECT * FROM cliente";
		try {
			java.sql.PreparedStatement ps = super.getInstance().prepareStatement(select);
			java.sql.ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Cliente c = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
				listadoClientes.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listadoClientes;
	}

	@Override
	public void createCliente() {
		String query = "CREATE TABLE cliente (id INT, name VARCHAR(30), email VARCHAR(30), PRIMARY KEY (id))";
		try {
			super.getInstance().prepareStatement(query).execute();
			super.getInstance().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void insertCliente(String name, String mail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente getCliente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> getClienteByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> getClienteByMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> getRankingFacturacion() {
		// TODO Auto-generated method stub
		return null;
	}

}
