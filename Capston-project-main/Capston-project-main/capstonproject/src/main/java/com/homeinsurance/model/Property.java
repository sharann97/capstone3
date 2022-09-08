package com.homeinsurance.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Property {
	@Id
	@GeneratedValue(generator = "property_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "property_gen",sequenceName = "property_seq",initialValue = 50,allocationSize = 1)
    private Integer propertyId;
    private String type;//villa,building,apartment
    private String category;//residential,educational,business,industrial,storage
    private double cost;
    private double squareFeet;
    @ManyToOne(cascade = CascadeType.ALL)
    private Buyer buyer;
    
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property(String type, String category, double cost, double squareFeet) {
		super();
		this.type = type;
		this.category = category;
		this.cost = cost;
		this.squareFeet = squareFeet;
	}
	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}
	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	
	
}
