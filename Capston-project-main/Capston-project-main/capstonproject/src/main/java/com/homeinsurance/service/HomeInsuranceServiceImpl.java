package com.homeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeinsurance.model.HomeInsurance;
import com.homeinsurance.repository.HomeInsuranceRepository;
@Service
public class HomeInsuranceServiceImpl implements HomeInsuranceService{
	HomeInsuranceRepository homeInsuranceRepository;
	
    @Autowired
	public void setHomeInsuranceRepository(HomeInsuranceRepository homeInsuranceRepository) {
		this.homeInsuranceRepository = homeInsuranceRepository;
	}

	@Override
	public void addInsurance(HomeInsurance homeinsurance) {
		homeInsuranceRepository.save(homeinsurance);
	}

	@Override
	public void updateInsurance(HomeInsurance homeinsurance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HomeInsurance> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getById(int insuranceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getBySumAssured(double sumAssured) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getByCoverage(String coverage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getByTerm(int term) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getByPremium(double premium) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HomeInsurance> getByVendorId(String vendor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateCost(double homeCost, double squareFt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
