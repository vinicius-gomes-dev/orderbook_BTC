package com.btc.orderbook.webservices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class OrderbookWebService {
	
//	static String webservice = "https://www.mercadobitcoin.net/api/BTC/orderbook/";
	
	public static void getAllOrderbook() throws Exception {
//		String urlToCall = webservice;
		
		RestTemplate template = new RestTemplate();
		
		UriComponents uri = UriComponentsBuilder.newInstance()
												.scheme("https")
												.host("www.mercadobitcoin.net")
												.path("api/BTC/orderbook/")
												.build();
		
		ResponseEntity<OrderbookWsDTO> entity = template.getForEntity(uri.toUriString(), OrderbookWsDTO.class);
		
		System.out.println("## RESPONSE ##" + entity.getBody());
		System.out.println("## FINISH ##");
		
		
		

// ## APENAS PARA REGISTRAR NO COMMIT MEU RACIOCINIO ANTERIOR ##
		
//		try {
//			URL url = new URL(urlToCall);
//			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//			
//			if(connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
//				throw new RuntimeException("HTTP error code: " + connection.getResponseCode());
//			}
//
//			BufferedReader resposta = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//			
//			while(resposta.readLine() != null) {
//				System.out.println("## RESPOSTA ## " + resposta.readLine());
//			}
//			System.out.println("## HERE ##");
//			
//		} catch (Exception e) {
//			throw new Exception("Erro: " + e);
//		}
		
	}

}
