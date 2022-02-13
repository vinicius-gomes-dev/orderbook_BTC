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
	private Long askPrice;
	
	@Column(name = "ask_volume", nullable = false)
	private Long askVolume;
	
	@Column(name = "bid_price", nullable = false)
	private Long bidPrice;
	
	@Column(name = "bid_volume", nullable = false)
	private Long bidVolume;
	
	@Column(name = "orderbook_timestamp", nullable = false)
	private Long timestamp;
	
	
	public Orderbook() {}

	public Orderbook(Long id, Long askPrice, Long askVolume, Long bidPrice, Long bidVolume, Long timestamp) {
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

	public Long getAskPrice() {
		return askPrice;
	}

	public void setAskPrice(Long askPrice) {
		this.askPrice = askPrice;
	}

	public Long getAskVolume() {
		return askVolume;
	}

	public void setAskVolume(Long askVolume) {
		this.askVolume = askVolume;
	}

	public Long getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(Long bidPrice) {
		this.bidPrice = bidPrice;
	}

	public Long getBidVolume() {
		return bidVolume;
	}

	public void setBidVolume(Long bidVolume) {
		this.bidVolume = bidVolume;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	
	
	
}
