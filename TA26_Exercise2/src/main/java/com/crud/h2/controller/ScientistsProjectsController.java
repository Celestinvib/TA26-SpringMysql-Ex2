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

import com.crud.h2.dto.ScientistsProjects;
import com.crud.h2.service.ScientistsProjectsServiceImpl;

@RestController
@RequestMapping("/api")
public class ScientistsProjectsController {

	@Autowired
	ScientistsProjectsServiceImpl projectServiceImpl;
	
	@GetMapping("/asginacion-proyectos")
	public List<ScientistsProjects> listScientistsProjects(){
		return projectServiceImpl.listScientistsProjects();
	}
	
	@PostMapping("/asginacion-proyectos")
	public ScientistsProjects saveProject(@RequestBody ScientistsProjects project) {
		
		return projectServiceImpl.saveScientistsProjects(project);
	}
	
	@GetMapping("/asginacion-proyectos/{id}")
	public ScientistsProjects manufacturerXID(@PathVariable(name="id") Long id) {
		
		ScientistsProjects scientistsProjects_xid= new ScientistsProjects();
		
		scientistsProjects_xid= projectServiceImpl.scientistProjectsXID(id);
		
		System.out.println("CientificosProyectos (Asignados_A) XID: "+scientistsProjects_xid);
		
		return scientistsProjects_xid;
	}
	
	@PutMapping("/asginacion-proyectos/{id}")
	public ScientistsProjects updateProject(@PathVariable(name="id")Long id,@RequestBody ScientistsProjects scientistsProjects) {
		
		ScientistsProjects scientistsProjectsSelected= new ScientistsProjects();
		ScientistsProjects scientistsProjectsUpdated = new ScientistsProjects();
		
		scientistsProjectsSelected=  projectServiceImpl.scientistProjectsXID(id);
		
		scientistsProjectsSelected.setScientist(scientistsProjects.getScientist());
		scientistsProjectsSelected.setProject(scientistsProjects.getProject());

	
		scientistsProjectsUpdated = projectServiceImpl.updateScientistsProjects(scientistsProjectsSelected);
		
		System.out.println("El CientificosProyectos (Asignados_A) actualizado es: "+ scientistsProjectsUpdated);
		
		return scientistsProjectsUpdated;
	}
	
	@DeleteMapping("/asginacion-proyectos/{id}")
	public void deleteScientistsProjects(@PathVariable(name="id")Long id) {
		projectServiceImpl.deleteScientistsProjects(id);
	}	
}
