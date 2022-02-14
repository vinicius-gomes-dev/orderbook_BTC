package com.btc.orderbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.orderbook.repositories.OrderbookRepository;

@Service
public class OrderbookService {
	
	@Autowired
	private OrderbookRepository repository;
	
	
	public void findAllByInterval(int interval) {
		repository.findAll();
	}

}
