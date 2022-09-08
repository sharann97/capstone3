package com.homeinsurance.service;

import java.util.List;

import com.homeinsurance.model.Property;

public interface PropertyService {

	// CRUD
	public void addProperty(Property property);

	public void deleteProperty(int properyId);

	public void updateProperty(Property property);

	// query table
	List<Property> getByBuyerName(String name);

	List<Property> getByInsuranceName(String name);

}
