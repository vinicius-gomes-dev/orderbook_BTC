package com.btc.orderbook.dto.orderbook;

import com.btc.orderbook.models.Orderbook;

public class OrderbookResponseDTO {
	private String askPrice;
	private String askVolume;
	private String bidPrice;
	private String bidVolume;
	private String timestamp;
	
	
	public OrderbookResponseDTO() {}

	public OrderbookResponseDTO(String askPrice, String askVolume, String bidPrice, String bidVolume, String timestamp) {
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

	
	@Override
	public String toString() {
		return "OrderbookResponseDTO [askPrice=" + askPrice + ", askVolume=" + askVolume + ", bidPrice=" + bidPrice
				+ ", bidVolume=" + bidVolume + ", timestamp=" + timestamp + "]";
	}
	
}
