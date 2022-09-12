package com.ramostear.springboot.uploadfile.repository;

import com.ramostear.springboot.uploadfile.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long>{}
