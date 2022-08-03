package com.advancia.stage.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REGION")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne(mappedBy = "REGION_ID", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false) // COUNTRIES
	private int id;

	@Column(name = "REGION_NAME")
	private String name;

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
}
