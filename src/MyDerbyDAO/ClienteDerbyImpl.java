package MyDerbyDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.ConexionDerby;
import Interface.DAOCliente;
import Modelo.Cliente;

public class ClienteDerbyImpl extends ConexionDerby implements DAOCliente{
	

	@Override
	public List<Cliente> selectClientes() {
		List<Cliente> listadoClientes = new ArrayList<>();
		String select = "SELECT * FROM cliente";
		try {
			PreparedStatement ps = super.getInstance().prepareStatement(select);
			ResultSet rs = ps.executeQuery();
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
		String query = "INSERT INTO cliente values ('', ?, ?)";
		PreparedStatement ps;
		try {
			ps = super.getInstance().prepareStatement(query);
			ps.setString(2, name);
			ps.setString(3, mail);
			ps.executeUpdate();
			ps.close();
			super.getInstance().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Cliente getCliente(int id) {
		String query = "SELECT * FROM cliente WHERE id = ?";
		PreparedStatement ps;
		try {
			ps = super.getInstance().prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			ps.close();
			Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
			return cliente;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> getClienteByName(String name) {
		String query = "SELECT * FROM cliente WHERE name = ?";
		PreparedStatement ps;
		try {
			ps = super.getInstance().prepareStatement(query);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			ps.close();
			ArrayList<Cliente> listado = new ArrayList();
			while (rs.next()) {				
				Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
				listado.add(cliente);
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Cliente getClienteByMail(String mail) {
		String query = "SELECT * FROM cliente WHERE email = ?";
		PreparedStatement ps;
		try {
			ps = super.getInstance().prepareStatement(query);
			ps.setString(1, mail);
			ResultSet rs = ps.executeQuery();
			ps.close();
			ArrayList<Cliente> listado = new ArrayList();
			while (rs.next()) {				
				Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
				listado.add(cliente);
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> getRankingFacturacion() {
		String query = "SELECT * FROM cliente"; //TODO falta realizar la consulta que te da el rankind
		PreparedStatement ps;
		try {
			ps = super.getInstance().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ps.close();
			ArrayList<Cliente> listado = new ArrayList();
			while (rs.next()) {				
				Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
				listado.add(cliente);
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
