package com.ramostear.springboot.uploadfile.service;

import com.ramostear.springboot.uploadfile.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<UserModel>list();
    public Optional<UserModel> listId(Long Id);
    public int save(UserModel userModel);
    public void delete(Long Id);
}
