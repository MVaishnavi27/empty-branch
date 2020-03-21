package com.project.database.dao;

import org.springframework.data.repository.CrudRepository;


import com.project.database.pojos.Sectors;

public interface SectorsRepository extends CrudRepository<Sectors,Integer>{
	Iterable<Sectors> findAll();

}
