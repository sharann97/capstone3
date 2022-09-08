package com.homeinsurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@GeneratedValue(generator = "",strategy = GenerationType.AUTO)
	@SequenceGenerator(name ="add_seq",sequenceName = "add_seq" ,initialValue = 100,allocationSize = 1)
	private Integer id;
	private String City;
	private String State;
	private long zipcode;
	public Address() {
		super();
	}
	public Address(String city, String state, long zipcode) {
		super();
		City = city;
		State = state;
		this.zipcode = zipcode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", City=" + City + ", State=" + State + ", zipcode=" + zipcode + "]";
	}
	

}
