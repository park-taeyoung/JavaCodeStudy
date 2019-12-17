package com.eland.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	int id;

	@Column(name = "NAME")
	String name;

//	@ManyToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="CITY_ID", referencedColumnName="id")
//	private City city;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*
	 * public City getCity() { return city; }
	 * 
	 * public void setCity(City city) { this.city = city; }
	 */

}
