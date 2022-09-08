package com.homeinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeinsurance.model.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
     
}