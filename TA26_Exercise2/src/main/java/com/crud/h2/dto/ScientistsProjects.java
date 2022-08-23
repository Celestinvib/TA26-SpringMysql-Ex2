package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="scientists_projects")
public class ScientistsProjects {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
	
	
	@ManyToOne
    @JoinColumn(name = "scientist_id")
    Scientist scientist;
	
	@ManyToOne
    @JoinColumn(name = "project_id")
    Project project;
		

	/**Constructors */
	
	public ScientistsProjects() {
		
	}


	/**
	 * @param id
	 * @param scientist
	 * @param project
	 */
	public ScientistsProjects(Long id, Scientist scientist, Project project) {
		this.id = id;
		this.scientist = scientist;
		this.project = project;
	}
	
	/**Getters y Setters*/

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the scientist
	 */
	public Scientist getScientist() {
		return scientist;
	}


	/**
	 * @param scientist the scientist to set
	 */
	public void setScientist(Scientist scientist) {
		this.scientist = scientist;
	}


	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}


	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}
	
	/**
	 * Method printing data by console
	 */
	@Override
	public String toString() {
		return "CientificosProyectos (Asignados_A) [id=" + id + ", cientifico=" + scientist + ", proyecto=" + project + "]";
	}
	
}
