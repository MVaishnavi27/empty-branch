package com.project.database.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.database.dao.StockExchangeRepository;
import com.project.database.pojos.StockExchange;

@RestController
@RequestMapping("/stockexchange")

@CrossOrigin(origins="http://localhost:4200") 




public class StockExchangeController {

	@Autowired

	private StockExchangeRepository stockexchangeRepository;

	@RequestMapping("/getAllStockExchange")

	public Iterable<StockExchange> getAllStockExchange() {

		return stockexchangeRepository.findAll();

	}

	@PostMapping("/saveStockExchange")

	public StockExchange saveStockExchange(@RequestBody StockExchange stockexchange) {

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@PutMapping("/updateStockExchange/{stockexid}")

	public StockExchange updateStockExchange(@RequestBody StockExchange stockexchange,

			@PathVariable("stockexid") int stockexid) {

		stockexchange.setStockexid(stockexid);

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@DeleteMapping("/deleteStockExchange/{stockexid}")

	public Boolean deleteStockExchange(@PathVariable("stockexid") Integer stockexid) {

		System.out.println(stockexid);

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(stockexid);

		stockexchangeRepository.delete(stockexchange.get());

		return true;

	}

	@GetMapping("/findOneInAll3/{stockexid}")

	public StockExchange findOneInAll3(@PathVariable("stockexid") Integer stockexid) {

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(stockexid);

		return stockexchange.get();

	}

}
