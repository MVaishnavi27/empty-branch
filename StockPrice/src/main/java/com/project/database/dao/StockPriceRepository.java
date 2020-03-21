package com.project.database.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.database.pojos.StockPrice;

public interface StockPriceRepository extends CrudRepository<StockPrice,String>{
	Iterable<StockPrice> findAll();

	List<StockPrice> findByStockexchange(String stockexchange);

}
