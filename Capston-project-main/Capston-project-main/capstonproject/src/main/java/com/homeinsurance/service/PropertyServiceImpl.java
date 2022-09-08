package com.homeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeinsurance.model.Property;
import com.homeinsurance.repository.HomeInsuranceRepository;
@Service
public class PropertyServiceImpl implements PropertyService{
	
	HomeInsuranceRepository homeInsuranceRepository;
	
    @Autowired
	public void setHomeInsuranceRepository(HomeInsuranceRepository homeInsuranceRepository) {
		this.homeInsuranceRepository = homeInsuranceRepository;
	}

	@Override
	public void addProperty(Property property) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProperty(int properyId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProperty(Property property) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Property> getByBuyerName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> getByInsuranceName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
