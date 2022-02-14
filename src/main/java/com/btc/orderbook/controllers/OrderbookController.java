package com.btc.orderbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btc.orderbook.services.OrderbookService;

@RestController
@RequestMapping("/book")
public class OrderbookController {
	
	@Autowired
	private OrderbookService service;
	
	@GetMapping
	public String tempMethod() {
		return "Book route";
	}
	
	@GetMapping(path = "/get-all")
	public void getAll() {
		service.getAll();
	}

}
