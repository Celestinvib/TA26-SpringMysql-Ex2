package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IProjectDAO;
import com.crud.h2.dto.Project;

@Service
public class ProjectServiceImpl  implements IProjectService{
	//We use the methods of the IProjectDAO interface, it is as if we were instantiating.
	@Autowired
	IProjectDAO iProjectDAO;

	@Override
	public List<Project> listProjects() {
		
		return iProjectDAO.findAll();
	}

	@Override
	public Project saveProject(Project project) {
		
		return iProjectDAO.save(project);
	}

	@Override
	public Project projectXID(Long code) {
		
		return iProjectDAO.findById(code).get();
	}

	@Override
	public Project updateProject(Project project) {
		
		return iProjectDAO.save(project);
	}

	@Override
	public void deleteProject(Long code) {
		
		iProjectDAO.deleteById(code);
	}


}
