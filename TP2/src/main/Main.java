/**
 *<h3>Main</h3> 
 * 
 */

package main;

import repository.RepoEstudiante;

public class Main {

	public static void main(String[] args) {
		
		RepoEstudiante re = new RepoEstudiante();
		
		System.out.println(re.findById(1).toString());
				
	}	


}
