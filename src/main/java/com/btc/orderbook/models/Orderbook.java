package com.btc.orderbook.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_orderbook")
public class Orderbook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ask_price", nullable = false)
	private String askPrice;
	
	@Column(name = "ask_volume", nullable = false)
	private String askVolume;
	
	@Column(name = "bid_price", nullable = false)
	private String bidPrice;
	
	@Column(name = "bid_volume", nullable = false)
	private String bidVolume;
	
	@Column(name = "orderbook_timestamp", nullable = false)
	private String timestamp;
	
	
	public Orderbook() {}

	public Orderbook(Long id, String askPrice, String askVolume, String bidPrice, String bidVolume,
			String timestamp) {
		this.id = id;
		this.askPrice = askPrice;
		this.askVolume = askVolume;
		this.bidPrice = bidPrice;
		this.bidVolume = bidVolume;
		this.timestamp = timestamp;
	}

	
	public Long getId() {
		return id;
	}

	public String getAskPrice() {
		return askPrice;
	}

	public void setAskPrice(String askPrice) {
		this.askPrice = askPrice;
	}

	public String getAskVolume() {
		return askVolume;
	}

	public void setAskVolume(String askVolume) {
		this.askVolume = askVolume;
	}

	public String getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(String bidPrice) {
		this.bidPrice = bidPrice;
	}

	public String getBidVolume() {
		return bidVolume;
	}

	public void setBidVolume(String bidVolume) {
		this.bidVolume = bidVolume;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
