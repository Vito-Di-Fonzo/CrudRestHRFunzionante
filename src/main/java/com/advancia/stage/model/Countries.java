package com.advancia.stage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES")
public class Countries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne // LOCATIONS
	@Column(name = "COUNTRY_ID")
	private int id;
	@Column(name = "COUNTRY_NAME")
	private Countries name;

	@OneToOne(fetch = FetchType.LAZY) // REGION
    @JoinColumn(name = "REGION_ID")
	private Region region;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Countries getName() {
		return name;
	}

	public void setName(Countries name) {
		this.name = name;
	}

	public Region getRregionId() {
		return region;
	}

	public void setRegionId(Region region) {
		this.region = region;
	}
}

