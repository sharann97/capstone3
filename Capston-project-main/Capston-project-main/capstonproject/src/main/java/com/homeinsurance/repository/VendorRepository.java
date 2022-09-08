package com.homeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homeinsurance.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
//	@Query("")
//	public List<Vendor> findByState(int vendorId);
//	@Query("from Vendor where v inner join homeInsurance i where i.insuranceName=?1")
//	public List<Vendor> findByInsuranceName(String name);
//	
	
}