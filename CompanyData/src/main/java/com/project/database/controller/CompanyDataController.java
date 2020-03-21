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

import com.project.database.JSONCompanyClient;
import com.project.database.dao.CompanyRepository;
import com.project.database.pojos.CompanyData;

@RestController
@RequestMapping("/companydata")

@CrossOrigin(origins="http://localhost:4200") 


public class CompanyDataController {
	@Autowired
	JSONCompanyClient jcompany;

	@Autowired

	private CompanyRepository companyRepository;

	@RequestMapping("/getAllCompanyData")

	public Iterable<CompanyData> getAllCompanyData() {

		return companyRepository.findAll();

	}

	@PostMapping("/saveCompanyData")

	public CompanyData saveCompany(@RequestBody CompanyData company) {

		System.out.println(company);

		companyRepository.save(company);

		return company;

	}

	@PutMapping("/updateCompanyData/{companyname}")

	public CompanyData updateCompany(@RequestBody CompanyData company, @PathVariable("companyname") String companyname) {

		company.setCompanyname(companyname);

		System.out.println(companyname);

		companyRepository.save(company);

		return company;

	}

	@DeleteMapping("/deleteCompanyData/{username}")

	public Boolean deleteCompany(@PathVariable("username") String username) {

		System.out.println(username);

		companyRepository.deleteById(username);

		return true;

	}

	@GetMapping("/findOneInAll6/{companyname}")

	public CompanyData findOneInAll6(@PathVariable("companyname") String companyname) {

		Optional<CompanyData> company = companyRepository.findById(companyname);
		CompanyData comp=company.get();

		 comp.setStockPriceList(jcompany.findByCompanyname(companyname));



		return company.get();

	}

}
