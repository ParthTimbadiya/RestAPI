package com.org.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.entity.User;

public interface UserRepo extends MongoRepository<User, ObjectId>{
	
	User findByUserName(String username);

}
