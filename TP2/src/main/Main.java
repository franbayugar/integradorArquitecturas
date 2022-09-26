/**
 *<h3>Main</h3> 
 * 
 */

package main;

import Entity.Estudiante;
import repository.RepoCarrera;
import repository.RepoEstudiante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		RepoEstudiante re = new RepoEstudiante();
		
		String date_time = "11/27/2020 05:35:00";
        SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		
		Estudiante es1= new Estudiante("Pepe","Lopez",dateParser.parse(date_time),"Hombrecito",22333444,"Tres Arroyos");
		re.create(es1);
		
		System.out.println(re.findById(1).toString());
		
		RepoCarrera rc = new RepoCarrera();
		
		System.out.println(rc.findById(1).toString());
		
		
				
	}	


}
