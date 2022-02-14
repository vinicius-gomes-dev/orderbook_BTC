package com.btc.orderbook.webservices;

import java.math.BigInteger;

public class OrderbookWsDTO {
	private String[][] asks;
	private String[][] bids;
	private BigInteger timestamp;
	
	
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
	public BigInteger getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(BigInteger timestamp) {
		this.timestamp = timestamp;
	}
}
