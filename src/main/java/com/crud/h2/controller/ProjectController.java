package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Project;
import com.crud.h2.service.ProjectServiceImpl;

@RestController
@RequestMapping("/api")
public class ProjectController {

	@Autowired
	ProjectServiceImpl projectServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Project> listProjects(){
		return projectServiceImpl.listProjects();
	}
	
	@PostMapping("/proyectos")
	public Project saveProject(@RequestBody Project project) {
		
		return projectServiceImpl.saveProject(project);
	}
	
	@GetMapping("/proyectos/{id}")
	public Project manufacturerXID(@PathVariable(name="id") Long id) {
		
		Project project_xid= new Project();
		
		project_xid= projectServiceImpl.projectXID(id);
		
		System.out.println("Cientifico XID: "+project_xid);
		
		return project_xid;
	}
	
	@PutMapping("/proyectos/{id}")
	public Project updateProject(@PathVariable(name="id")Long id,@RequestBody Project project) {
		
		Project projectSelected= new Project();
		Project projectUpdated = new Project();
		
		projectSelected=  projectServiceImpl.projectXID(id);
		
		projectSelected.setName(project.getName());
		projectSelected.setHours(project.getHours());

	
		projectUpdated = projectServiceImpl.updateProject(projectSelected);
		
		System.out.println("El proyecto actualizado es: "+ projectUpdated);
		
		return projectUpdated;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void deleteProject(@PathVariable(name="id")Long id) {
		projectServiceImpl.deleteProject(id);
	}	
}
