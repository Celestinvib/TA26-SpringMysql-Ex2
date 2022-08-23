package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="projects")
public class Project {

	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;

	private String name;
	
	private int hours;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<ScientistsProjects> scientistsProjects;
    
	/**Constructors */
    public Project() {
    	
    }

	/**
	 * @param id
	 * @param name
	 * @param hours
	 * @param scientistsProjects
	 */
	public Project(Long id, String name, int hours) {
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the scientistsProjects
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ScientistsProjects")
	public List<ScientistsProjects> getScientistsProjects() {
		return scientistsProjects;
	}

	/**
	 * @param scientistsProjects the scientistsProjects to set
	 */
	public void setScientistsProjects(List<ScientistsProjects> scientistsProjects) {
		this.scientistsProjects = scientistsProjects;
	}
	
	/**
	 * Method printing data by console
	 */
	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + name + ",horas=" + hours + "]";
	}
	
	
    
    
}
