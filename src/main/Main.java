package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.*;

import Factories.FactoryDB;
import Interface.DAOCliente;
import Interface.DAOFactura;
import Interface.DAOFacturaProducto;
import Interface.DAOProducto;

public class Main {

	public static void main(String[] args) {
		String dbName = "MySQL";
		FactoryDB db = FactoryDB.getConnetion(dbName);

		createProductosCSV(db.getDAOProducto());
		createClientesCSV(db.getDAOCliente());
		createFacturasCSV(db.getDAOFactura());
		createFacturaProductoCSV(db.getDAOFacturaProducto());


	}
	
	private static void createFacturaProductoCSV(DAOFacturaProducto daoFacturaProducto) {
		CSVParser parser = null;

		try {
			parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader("src/csv/facturas-productos.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		daoFacturaProducto.createFacturaProducto();
		for(CSVRecord row: parser) {
			daoFacturaProducto.insertFacturaProducto(Integer.valueOf(row.get("idFactura")), Integer.valueOf(row.get("idProducto")), Integer.valueOf(row.get("cantidad")));

		}
		
	}

	private static void createClientesCSV(DAOCliente daoCliente) {
		CSVParser parser = null;

		try {
			parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader("src/csv/clientes.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		daoCliente.createCliente();
		for(CSVRecord row: parser) {
			daoCliente.insertCliente(Integer.valueOf(row.get("idCliente")),row.get("nombre"), row.get("email"));

		}
		
	}

	private static void createFacturasCSV(DAOFactura daoFactura) {
		CSVParser parser = null;

		try {
			parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader("src/csv/facturas.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		daoFactura.createFactura();
		for(CSVRecord row: parser) {
			daoFactura.insertFactura(Integer.valueOf(row.get("idFactura")), Integer.valueOf(row.get("idCliente")));
		}
		
	}

	public static void createProductosCSV(DAOProducto daoProducto) {
		CSVParser parser = null;

		try {
			parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader("src/csv/productos.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		daoProducto.createProducto();
		for(CSVRecord row: parser) {
			daoProducto.insertProducto(Integer.valueOf(row.get("idProducto")), row.get("nombre"), Float.valueOf(row.get("valor")));

		}
	}

}
