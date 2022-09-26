/**
 *<h3>Main</h3> 
 * 
 */

package main;

import Entity.Carrera;
import Entity.Estudiante;
import repository.BaseRepository;
import repository.RepoCarrera;
import repository.RepoEstudiante;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		
		RepoEstudiante re = new RepoEstudiante();
		RepoCarrera rc = new RepoCarrera();
		
		LoadTableEstudiante(re);
		LoadTableCarrera(rc);
		
		
		String date_time = "11/27/2020 05:35:00";
        SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		
		Estudiante es1= new Estudiante("Luis","Mas",dateParser.parse(date_time),"Hombrecito",22333444,"Tres Arroyos");
	//	re.create(es1);
		
	//	System.out.println(re.findById(1).toString());
		
		
		
		Carrera ca=new Carrera ("Enfermeria", 2);
		
		//rc.create(ca);
		
		re.delete(26);
		
		rc.delete(20);
		
	//	System.out.println(rc.findById(13).toString());
		
		
				
	}	

	@SuppressWarnings("deprecation")
	private static void LoadTableEstudiante(RepoEstudiante es) {		
	
		CSVParser parser = null;

		try {
			parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader("src/csv/estudiantes.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//e.create();
		for(CSVRecord row: parser) {
			es.create((String.valueOf(row.get("nombres")), String.valueOf(row.get("apellido")), Date.parse(row.get("fecha_Nacimiento")), String.valueOf(row.get("genero")), Integer.valueOf(row.get("dni")), String.valueOf(row.get("ciudad_Residencia"))) ;

		}
		
	}	
	
	@SuppressWarnings("deprecation")
	private static void LoadTableCarrera(RepoCarrera c) {		
	
		CSVParser parser = null;

		try {
			parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader("src/csv/carreras.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//c.create();
		for(CSVRecord row: parser) {
			c.create(String.valueOf(row.get("nombre")), Integer.valueOf(row.get("duracion")));

		}
		
	}
}
