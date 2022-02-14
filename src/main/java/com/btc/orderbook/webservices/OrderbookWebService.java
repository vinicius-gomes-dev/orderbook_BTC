package com.btc.orderbook.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.btc.orderbook.models.Orderbook;

public class OrderbookWebService {
	
	public static List<Orderbook> getAllOrderbook() throws Exception {
		
		
		UriComponents uri = UriComponentsBuilder.newInstance()
												.scheme("https")
												.host("www.mercadobitcoin.net")
												.path("api/BTC/orderbook/")
												.build();
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<OrderbookWsDTO> entity = template.getForEntity(uri.toUriString(), OrderbookWsDTO.class);
		
		
		String[][] asks = entity.getBody().getAsks().clone();
		String[][] bids = entity.getBody().getBids().clone();
		String timestamp = entity.getBody().getTimestamp();
		
		List<Orderbook> response = new ArrayList<>();
		
		for(int line = 0; line < asks.length; line++) {
			response.add(new Orderbook(null, asks[line][0], asks[line][1], bids[line][0], bids[line][1], timestamp));
		}
				
		return response;
	}
}
