package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IScientistsProjectsDAO;
import com.crud.h2.dto.ScientistsProjects;

@Service
public class ScientistsProjectsServiceImpl  implements IScientistsProjectsService{
	//We use the methods of the iScientistsProjectsDAO interface, it is as if we were instantiating.
	@Autowired
	IScientistsProjectsDAO iScientistsProjectsDAO;

	@Override
	public List<ScientistsProjects> listScientistsProjects() {
		
		return iScientistsProjectsDAO.findAll();
	}

	@Override
	public ScientistsProjects saveScientistsProjects(ScientistsProjects scientistProjects) {
		
		return iScientistsProjectsDAO.save(scientistProjects);
	}

	@Override
	public ScientistsProjects scientistProjectsXID(Long Id) {
		
		return iScientistsProjectsDAO.findById(Id).get();
	}

	@Override
	public ScientistsProjects updateScientistsProjects(ScientistsProjects scientistProjects) {
		
		return iScientistsProjectsDAO.save(scientistProjects);
	}

	@Override
	public void deleteScientistsProjects(Long Id) {
		
		iScientistsProjectsDAO.deleteById(Id);
	}

}
