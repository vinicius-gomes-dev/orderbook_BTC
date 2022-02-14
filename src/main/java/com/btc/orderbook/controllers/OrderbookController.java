package com.btc.orderbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.btc.orderbook.dto.orderbook.OrderbookResponseDTO;
import com.btc.orderbook.services.OrderbookService;

@RestController
@RequestMapping("/book")
public class OrderbookController {
	
	@Autowired
	private OrderbookService service;
	
	
	@GetMapping
	public ResponseEntity<List<OrderbookResponseDTO>> findAllByInterval(@RequestParam int interval) {
		List<OrderbookResponseDTO> orderbookResDTO;
		orderbookResDTO = service.findAllByInterval(interval);
		
		
		return ResponseEntity.ok(orderbookResDTO);
	}
	
	@PostMapping(path = "/get-all")
	@ResponseStatus(value = HttpStatus.CREATED)
	public void getAll() {
		service.getAll();
	}

}
