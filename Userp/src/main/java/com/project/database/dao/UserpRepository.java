package com.project.database.dao;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.project.database.pojos.Userp;

public interface UserpRepository extends CrudRepository<Userp,Integer>{
	Iterable<Userp> findAll();

	Userp findByUsernameAndPassword(String username, String password);

	Userp findByUsernameAndPasswordAndConfirmed(String username, String password, String string);

	Optional<Userp> findByEmail(String emailId);



}
