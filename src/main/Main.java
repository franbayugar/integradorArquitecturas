package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.*;

public class Main {

	public static void main(String[] args) {
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
		for(CSVRecord row: parser) {
			System.out.println(row.get("idProducto"));
			System.out.println(row.get("nombre"));
			System.out.println(row.get("valor"));
		}

	}

}
