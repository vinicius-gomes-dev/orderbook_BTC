package com.btc.orderbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.orderbook.repositories.OrderbookRepository;
import com.btc.orderbook.webservices.OrderbookWebService;

@Service
public class OrderbookService {
	
	@Autowired
	private OrderbookRepository repository;
	
//	@Autowired
//	private OrderbookWebService webservice;
	
	
	public void findAllByInterval(int interval) {
		repository.findAll();
	}
	
	public void getAll() {
		try {
			OrderbookWebService.getAllOrderbook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
