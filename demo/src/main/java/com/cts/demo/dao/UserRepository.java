package com.cts.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.demo.pojos.User;

public interface UserRepository extends CrudRepository<User,String>{

}
