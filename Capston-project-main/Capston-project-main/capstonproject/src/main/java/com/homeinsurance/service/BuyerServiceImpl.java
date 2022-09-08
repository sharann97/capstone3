package com.homeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeinsurance.model.Buyer;
import com.homeinsurance.repository.BuyerRepository;
@Service
public class BuyerServiceImpl implements BuyerService{
	
	BuyerRepository buyerRepository;
	
     @Autowired
	public void setBuyerRepository(BuyerRepository buyerRepository) {
		this.buyerRepository = buyerRepository;
	}

	@Override
	public List<Buyer> getByName() {
		return null;
	}

	@Override
	public List<Buyer> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> getByAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Buyer buyer) {
		buyerRepository.save(buyer);
	}

}
