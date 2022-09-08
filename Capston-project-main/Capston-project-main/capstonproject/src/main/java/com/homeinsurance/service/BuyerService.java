package com.homeinsurance.service;

import java.util.List;

import com.homeinsurance.model.Buyer;

public interface BuyerService {
	public void add(Buyer buyer);

	public List<Buyer> getByName();

	public List<Buyer> getById(int id);

	public List<Buyer> getByAddress();
}
