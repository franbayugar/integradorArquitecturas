package MySQLDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Connection.ConexionMySql;
import Interface.DAOFactura;
import Modelo.Factura;

public class FacturaMysqlImpl extends ConexionMySql implements DAOFactura{

	@Override
	public List<Factura> selectFacturas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createFactura() {
		String query = "CREATE TABLE factura (idFactura INT, idCliente INT, PRIMARY KEY (idFactura, idCliente))";
		try {
			super.getInstance().prepareStatement(query).execute();
			super.getInstance().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertFactura(int idFactura, int idCliente) {
		String query = "INSERT INTO factura values (?, ?)";
		PreparedStatement ps;
		try {
			ps = super.getInstance().prepareStatement(query);
			ps.setInt(1, idFactura);
			ps.setInt(2, idCliente);
			ps.executeUpdate();
			ps.close();
			super.getInstance().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Factura getFactura(int idFactura) {
		// TODO Auto-generated method stub
		return null;
	}


}
