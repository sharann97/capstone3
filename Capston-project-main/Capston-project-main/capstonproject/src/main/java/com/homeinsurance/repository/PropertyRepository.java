package com.homeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homeinsurance.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {

//	Property findByInsuranceId(int insuranceId);
//
//	Property findByBuyerId(int insuranceId);
//@Query("from Property p inner join insurances i where i.name=?1")
//	List<Property> findByInsuranceName(String insuranceName);
//@Query("from Property p inner join buyer b where b.name=?1")
//	List<Property> findByBuyerName(String buyerName);
//@Query(value="select * from property p inner join buyer b where b.buyer_id=p.property_id and b.type=?1",nativeQuery = true)
//	List<Property> findByBuyerType(String type);
//
//	

}
