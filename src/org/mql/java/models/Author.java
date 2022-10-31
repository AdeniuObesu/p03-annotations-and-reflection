/**
 * 
 */
package org.mql.java.models;

import org.mql.java.annotations.Form;
import org.mql.java.annotations.TextField;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
@Form(value = "Nouvel auteur", width = 500)
public class Author {
	@TextField(label = "Identificateur", size = 20)
	private int id;
	private String name;
	private int yearBorn;
	private String country;
	
	/**
	 * 
	 */
	public Author() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param yearBorn
	 * @param country
	 */
	public Author(int id, String name, int yearBorn, String country) {
		super();
		this.id = id;
		this.name = name;
		this.yearBorn = yearBorn;
		this.country = country;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the yearBorn
	 */
	public int getYearBorn() {
		return yearBorn;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	
}
