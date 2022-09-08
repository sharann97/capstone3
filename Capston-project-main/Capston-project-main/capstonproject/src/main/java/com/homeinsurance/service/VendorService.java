package com.homeinsurance.service;

import java.util.List;

import com.homeinsurance.model.HomeInsurance;
import com.homeinsurance.model.Vendor;

public interface VendorService {
	public List<Vendor> getByInsuranceName(String name);

	public List<Vendor> getById(int id);

	public List<Vendor> getByAddress(String address);

}
