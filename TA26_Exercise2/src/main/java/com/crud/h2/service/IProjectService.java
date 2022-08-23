package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Project;

public interface IProjectService {
	//CRUD methods
	public List<Project> listProjects(); //List All 
	
	public Project saveProject(Project project);//Save a new project "CREATE"
	
	public Project projectXID(Long code); //Read data from a project "READ"
			
	public Project updateProject(Project project); //Update project data "UPDATE"
	
	public void deleteProject(Long code);// Delete a project via id "DELETE"
}
