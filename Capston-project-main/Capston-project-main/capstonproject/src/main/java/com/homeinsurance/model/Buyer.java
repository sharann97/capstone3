package com.homeinsurance.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Buyer {
	@Id
	@GeneratedValue(generator = "buyer_gen",strategy =GenerationType.AUTO)
	@SequenceGenerator(name = "buyer_gen",sequenceName = "buyer_seq",initialValue =500,allocationSize = 1)
	private Integer buyerId;
	private String name;
	private long mobileNo;
	@OneToOne(cascade =CascadeType.ALL)
	private Address address;
	private String type;//rent,owner
	private String occupation;
	@ManyToMany(mappedBy = "buyers")
	private Set<HomeInsurance> insurances;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Property> properties;
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Buyer(String name, long mobileNo, Address address, String type, String occupation,
			Set<Property> properties) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.type = type;
		this.occupation = occupation;
		this.properties = properties;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Set<HomeInsurance> getInsurances() {
		return insurances;
	}
	public void setInsurances(Set<HomeInsurance> insurances) {
		this.insurances = insurances;
	}
	public Set<Property> getProperties() {
		return properties;
	}
	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}
	

}
