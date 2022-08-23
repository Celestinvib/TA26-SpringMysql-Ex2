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

import com.crud.h2.dto.Scientist;
import com.crud.h2.service.ScientistServiceImpl;

@RestController
@RequestMapping("/api")
public class ScientistController {

	@Autowired
	ScientistServiceImpl scientistServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Scientist> listScientists(){
		return scientistServiceImpl.listScientists();
	}
	
	@PostMapping("/cientificos")
	public Scientist saveScientist(@RequestBody Scientist scientist) {
		
		return scientistServiceImpl.saveScientist(scientist);
	}
	
	@GetMapping("/cientificos/{id}")
	public Scientist manufacturerXID(@PathVariable(name="id") Long id) {
		
		Scientist scientist_xid= new Scientist();
		
		scientist_xid= scientistServiceImpl.scientistXId(id);
		
		System.out.println("Cientifico XID: "+scientist_xid);
		
		return scientist_xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Scientist updateScientist(@PathVariable(name="id")Long id,@RequestBody Scientist scientist) {
		
		Scientist scientistSelected= new Scientist();
		Scientist scientistUpdated = new Scientist();
		
		scientistSelected= scientistServiceImpl.scientistXId(id);
		
		scientistSelected.setDNI(scientist.getDNI());
		scientistSelected.setNameSurnames(scientist.getNameSurnames());

	
		scientistUpdated = scientistServiceImpl.updateScientist(scientistSelected);
		
		System.out.println("El cientifico actualizado es: "+ scientistUpdated);
		
		return scientistUpdated;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void deleteScientist(@PathVariable(name="id")Long id) {
		scientistServiceImpl.deleteScientist(id);
	}	
}
