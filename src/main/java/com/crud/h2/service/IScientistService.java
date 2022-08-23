package com.crud.h2.service;

import java.util.List;
import com.crud.h2.dto.Scientist;



public interface IScientistService {
		//CRUD methods
		public List<Scientist> listScientists(); //List All 
		
		public Scientist saveScientist(Scientist scientist);//Save a new scientist "CREATE"
		
		public Scientist scientistXId(Long id); //Read data from a scientist "READ"
				
		public Scientist updateScientist(Scientist scientist); //Update scientist data "UPDATE"
		
		public void deleteScientist(Long id);// Delete a scientist via id "DELETE"
}
