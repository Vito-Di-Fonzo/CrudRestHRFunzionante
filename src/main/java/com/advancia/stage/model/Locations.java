package com.advancia.stage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATIONS")
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@OneToOne // DEPARTMENTS
	@Column(name = "LOCATION_ID")
	private int id;

	@Column(name = "STREET_ADDRESS")
	private String street;
	@Column(name = "POSTAL_CODE")
	private String cap;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STARE_PROVINCE")
	private String province;

	@OneToOne // COUNTRIES
	@JoinColumn(name = "COUNTRY_ID")
	private Countries country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}

}
