package com.homeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeinsurance.model.Vendor;
import com.homeinsurance.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	VendorRepository repository;

	@Autowired
	public void setRepository(VendorRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Vendor> getByInsuranceName(String name) {
		return null;
	}

	@Override
	public List<Vendor> getById(int id) {
		return null;
	}

	@Override
	public List<Vendor> getByAddress(String address) {
		return null;
	}

}
