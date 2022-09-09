package MySQLDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Connection.ConexionMySql;
import Interface.DAOProducto;
import Modelo.Producto;

public class ProductoMysqlImpl extends ConexionMySql implements DAOProducto{

	@Override
	public List<Producto> selectProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProducto() {
		String query = "CREATE TABLE producto (id INT, name VARCHAR(45), value float, PRIMARY KEY (id))";
		try {
			super.getInstance().prepareStatement(query).execute();
			super.getInstance().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertProducto(int id, String name, float value) {
		String query = "INSERT INTO producto(id,name, value) values (?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = super.getInstance().prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3, value);
			ps.executeUpdate();
			ps.close();
			super.getInstance().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Producto getProducto(int idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getMayorRecaudacion() {
		// TODO Auto-generated method stub
		return null;
	}


}
