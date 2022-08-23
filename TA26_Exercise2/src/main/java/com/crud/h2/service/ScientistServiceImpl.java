package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IScientistDAO;
import com.crud.h2.dto.Scientist;

@Service
public class ScientistServiceImpl  implements IScientistService{
	//We use the methods of the IScientistDAO interface, it is as if we were instantiating.
	@Autowired
	IScientistDAO iScientistDAO;

	@Override
	public List<Scientist> listScientists() {
		
		return iScientistDAO.findAll();
	}

	@Override
	public Scientist saveScientist(Scientist scientist) {
		
		return iScientistDAO.save(scientist);
	}

	@Override
	public Scientist scientistXId(Long id) {
		
		return iScientistDAO.findById(id).get();
	}

	@Override
	public Scientist updateScientist(Scientist scientist) {
		
		return iScientistDAO.save(scientist);
	}

	@Override
	public void deleteScientist(Long id) {
		
		iScientistDAO.deleteById(id);
	}
	

}
