package com.btc.orderbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.orderbook.dto.orderbook.OrderbookResponseDTO;
import com.btc.orderbook.models.Orderbook;
import com.btc.orderbook.repositories.OrderbookRepository;
import com.btc.orderbook.webservices.OrderbookWebService;

@Service
public class OrderbookService {
	
	@Autowired
	private OrderbookRepository repository;
	
	
	
	public List<OrderbookResponseDTO> findAllByInterval(int intervalParam) {
		int interval = (intervalParam < 1) ? 1 : intervalParam;
		
		List<Orderbook> result;
		result = repository.findAll();
		
		if(interval > 1) {
			List<Orderbook> resultInterval;
			resultInterval = new ArrayList<>();
			
			for(int i = 0; i < result.size(); i+=interval) {
				resultInterval.add(result.get(i));
			}
			
			result = resultInterval;
		}

		List<OrderbookResponseDTO> resultDTO;
		resultDTO = result.stream().map(x -> new OrderbookResponseDTO(x)).collect(Collectors.toList());
		
		return resultDTO;
	}
	
	public void getAll() {
		try {
			List<Orderbook> result = OrderbookWebService.getAllOrderbook();
			
			repository.deleteAll();
			repository.saveAllAndFlush(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
