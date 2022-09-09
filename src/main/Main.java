package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.*;

import Factories.FactoryDB;

public class Main {

	public static void main(String[] args) {
		CSVParser parser = null;
		String dbName = "MySQL";
		FactoryDB db = FactoryDB.getConnetion(dbName);
		
		try {
			parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader("src/csv/productos.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.getDAOProducto().createProducto();
		for(CSVRecord row: parser) {
			db.getDAOProducto().insertProducto(Integer.valueOf(row.get("idProducto")), row.get("nombre"), Float.valueOf(row.get("valor")));

		}

	}

}
