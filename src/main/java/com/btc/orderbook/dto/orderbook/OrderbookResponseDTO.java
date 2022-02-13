package com.btc.orderbook.dto.orderbook;

import com.btc.orderbook.models.Orderbook;

public class OrderbookResponseDTO {
	private Long askPrice;
	private Long askVolume;
	private Long bidPrice;
	private Long bidVolume;
	private Long timestamp;
	
	
	public OrderbookResponseDTO() {}

	public OrderbookResponseDTO(Long askPrice, Long askVolume, Long bidPrice, Long bidVolume, Long timestamp) {
		this.askPrice = askPrice;
		this.askVolume = askVolume;
		this.bidPrice = bidPrice;
		this.bidVolume = bidVolume;
		this.timestamp = timestamp;
	}
	
	public OrderbookResponseDTO(Orderbook entity) {
		askPrice = entity.getAskPrice();
		askVolume = entity.getAskVolume();
		bidPrice = entity.getBidPrice();
		bidVolume = entity.getBidVolume();
		timestamp = entity.getTimestamp();
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
