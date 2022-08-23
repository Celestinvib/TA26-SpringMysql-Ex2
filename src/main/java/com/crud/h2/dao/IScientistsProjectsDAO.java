package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.ScientistsProjects;

public interface IScientistsProjectsDAO extends JpaRepository<ScientistsProjects, Long>{

}