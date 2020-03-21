package com.project.database.dao;

import org.springframework.data.repository.CrudRepository;


import com.project.database.pojos.StockExchange;

public interface StockExchangeRepository extends CrudRepository<StockExchange,Integer>{
	Iterable<StockExchange> findAll();

}
