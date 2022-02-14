package com.btc.orderbook.webservices;

public class OrderbookWsDTO {
	private String[][] asks;
	private String[][] bids;
	private String timestamp;
	
	
	public String[][] getAsks() {
		return asks;
	}
	public void setAsks(String[][] asks) {
		this.asks = asks;
	}
	public String[][] getBids() {
		return bids;
	}
	public void setBids(String[][] bids) {
		this.bids = bids;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
