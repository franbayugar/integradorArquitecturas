/**
 *<h3>Main</h3> 
 * 
 */

package main;

import Entity.Carrera;
import Entity.Cursa;
import Entity.Estudiante;
import repository.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
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
		RepoCursa rcu = new RepoCursa();
		
	//	LoadTableEstudiante(re);
	//	LoadTableCarrera(rc);
		
		String date_time = "11/27/2020";
        SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yyyy");
		Estudiante es1= new Estudiante("Luis","Mas",dateParser.parse(date_time),"Hombrecito",22333444,"Tres Arroyos");
		re.create(es1);
		Carrera ca=new Carrera ("Enfermeria", 2);
		rc.create(ca);
		Cursa cu = new Cursa(es1, ca, dateParser.parse(date_time), false);
		rcu.create(cu);
		System.out.println(re.getEstudiantes());

				
	}	

	//@SuppressWarnings("deprecation")
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
			Estudiante est=new Estudiante (String.valueOf(row.get("nombres")), String.valueOf(row.get("apellido")), new Date(row.get("fecha_Nacimiento")), String.valueOf(row.get("genero")), Integer.valueOf(row.get("dni")), String.valueOf(row.get("ciudad_Residencia"))) ;
			es.create(est) ;
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
			Carrera r = new Carrera (String.valueOf(row.get("nombre_carrera")),Integer.valueOf(row.get("duracion")));
			c.create(r);
		}		
	}
	
}
