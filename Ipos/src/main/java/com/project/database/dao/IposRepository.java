package com.project.database.dao;

import org.springframework.data.repository.CrudRepository;


import com.project.database.pojos.Ipos;

public interface IposRepository extends CrudRepository<Ipos,Integer>{
	Iterable<Ipos> findAll();

}
