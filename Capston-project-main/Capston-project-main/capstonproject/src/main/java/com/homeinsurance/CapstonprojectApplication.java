package com.homeinsurance;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.homeinsurance.model.Address;
import com.homeinsurance.model.Buyer;
import com.homeinsurance.model.HomeInsurance;
import com.homeinsurance.model.Property;
import com.homeinsurance.model.Vendor;
import com.homeinsurance.repository.HomeInsuranceRepository;
import com.homeinsurance.service.BuyerService;
import com.homeinsurance.service.HomeInsuranceService;

@SpringBootApplication
public class CapstonprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CapstonprojectApplication.class, args);
	}
	@Autowired
	BuyerService buyerService;
	@Autowired
	HomeInsuranceService homeInsuranceService;
  
	@Override
	public void run(String... args) throws Exception {
		 //TODO Auto-generated method stub
		 Address address=new Address("kokrajhar","Assam", 78330);
		 Address address3=new Address("Hyderabad","telangana",501102);
		 Address address2=new Address("Thumkur","Bangalore",501101);
		 Property property1=new Property("Building","Residential",20000000,2000);
		 Property property2=new Property("Flat","Industrial",75000000,50000);
		 Property property3=new Property("Building","Residential",25000000,1500);
		 Set<Property>propertyList=new HashSet<>(Arrays.asList(property1,property2));
		 Set<Property>propertyList1=new HashSet<>(Arrays.asList(property3));
		 
		 Buyer  buyer2=new Buyer("Sharan",98737964, address3,"rent","Software trainee", propertyList1);
		 Buyer  buyer=new Buyer("Rajath",99999999, address,"owner","Software Developer", propertyList);
		 Set<Buyer>buyers=new HashSet<>(Arrays.asList(buyer,buyer2));
		 //buyerService.add(buyer);
		 Vendor vendor1=new Vendor("thanos",address2);
		 HomeInsurance  homeInsurance=new HomeInsurance("HDFC ERGO",600000,"Burglory-Theft",3,60000,vendor1,buyers);
		 homeInsuranceService.addInsurance(homeInsurance);
	}

}
