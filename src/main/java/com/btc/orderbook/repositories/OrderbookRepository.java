package com.btc.orderbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btc.orderbook.models.Orderbook;

public interface OrderbookRepository extends JpaRepository<Orderbook, Long> {

}
