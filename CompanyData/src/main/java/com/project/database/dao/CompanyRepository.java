package com.project.database.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.database.pojos.CompanyData;

public interface CompanyRepository extends CrudRepository<CompanyData,String>{
Iterable<CompanyData> findAll();
}
