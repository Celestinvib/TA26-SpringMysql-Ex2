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
@Table(name="scientists")
public class Scientist {

	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
	
	private String DNI;

	private String nameSurnames;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "scientist")
    private List<ScientistsProjects> scientistsProjects;

	/**Constructors */
    
    public Scientist() {
    	
    }

	
	/**
	 * @param id
	 * @param dNI
	 * @param nameSurnames
	 */
	public Scientist(Long id, String dNI, String nameSurnames) {
		this.id = id;
		DNI = dNI;
		this.nameSurnames = nameSurnames;
	}


	/**Getters y Setters*/


	/**
	 * @return the nameSurnames
	 */
	public String getNameSurnames() {
		return nameSurnames;
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
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}


	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}


	/**
	 * @param nameSurnames the nameSurnames to set
	 */
	public void setNameSurnames(String nameSurnames) {
		this.nameSurnames = nameSurnames;
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
		return "Cientifico [DNI=" + DNI + ", nomApels=" + nameSurnames + "]";
	}
	
    
}
