package com.project.database;

import java.util.List;




import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.project.database.pojos.StockPrice;


@FeignClient(value = "jcompany", url = "http://localhost:8095/stockprice/")

public interface JSONCompanyClient {



 @GetMapping("/findByCompanyname/{companyname}")

 public List<StockPrice> findByCompanyname(@PathVariable("companyname") String companyname);
}