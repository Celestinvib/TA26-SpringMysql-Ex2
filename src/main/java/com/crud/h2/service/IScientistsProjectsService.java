package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.ScientistsProjects;

public interface IScientistsProjectsService {
	//CRUD methods
		public List<ScientistsProjects> listScientistsProjects(); //List All 
		
		public ScientistsProjects saveScientistsProjects(ScientistsProjects scientistProjects);//Save a new scientistProjects "CREATE"
		
		public ScientistsProjects scientistProjectsXID(Long id); //Read data from a scientistProjects "READ"
				
		public ScientistsProjects updateScientistsProjects(ScientistsProjects scientistProjects); //Update scientistProjects data "UPDATE"
		
		public void deleteScientistsProjects(Long id);// Delete a scientistProjects via id "DELETE"
}
