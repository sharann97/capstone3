package com.homeinsurance.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.homeinsurance.model.HomeInsurance;

@Repository
public interface HomeInsuranceRepository extends JpaRepository<HomeInsurance, Integer> {
	
//	public List<HomeInsurance> findByVendorName(String name);
//    @Query()
//	public List<HomeInsurance> findByCoverage(String coverage);
//	@Query("from HomeInsurance h where h.premium<=?1")
//	public List<HomeInsurance>  findByCostSquareFeet(double costSquareFeet);
//	@Query("from HomeInsurance h inner join properties p where p.type=?1")
//	public List<HomeInsurance> findInsuranceByPropertyType(String type );
//	@Query(value="select * from homeinsurance h inner join property p where h.insuranceId =p.propertyId and p.category=?1" ,nativeQuery = true )
//	public List<HomeInsurance>findInsuranceByPropertyCategory(String category);
//	

}
