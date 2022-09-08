package com.homeinsurance.model;




import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class HomeInsurance {
	@Id
	@GeneratedValue(generator = "insurance_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "insurance_gen",sequenceName = "insurance_seq",initialValue = 999,allocationSize = 10)
	@Column(name="insuranceId")
	private Integer insuranceId;
	private String insuranceName;
	
	private double sumAssured;
	//content,building+content,building
	
	private String coverage;
	//fire,earthquake,theft
	private int term;
	private double premium ;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="insurance_vendor")
	private Vendor vendor;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="homeInsurance_buyer", joinColumns = @JoinColumn(name="insurance_id"),inverseJoinColumns = @JoinColumn(name="buyer_Id"))
	private Set<Buyer>  buyers;
	
	
	public HomeInsurance() {
		super();
	}
	public HomeInsurance(String insuranceName,  double sumAssured,String coverage, int term,
			double premium, Vendor vendor, Set<Buyer> buyers) {
		super();
		this.insuranceName = insuranceName;
		this.sumAssured = sumAssured;
		this.coverage = coverage;
		this.term = term;
		this.premium = premium;
		this.vendor = vendor;
		this.buyers = buyers;
	
	}
	public Integer getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	
	
	public double getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public Set<Buyer> getBuyers() {
		return buyers;
	}
	public void setBuyers(Set<Buyer> buyers) {
		this.buyers = buyers;
	}
	
	
	
	
	
	
}