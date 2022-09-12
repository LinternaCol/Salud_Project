package com.ramostear.springboot.uploadfile.service.impl;

import com.ramostear.springboot.uploadfile.model.UserModel;
import com.ramostear.springboot.uploadfile.repository.UserRepository;
import com.ramostear.springboot.uploadfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;
    @Override
    public List<UserModel> list() {
        return (List<UserModel>)userRepository.findAll();
    }

    @Override
    public Optional<UserModel> listId(Long Id) {
        return Optional.empty();
    }

    @Override
    public int save(UserModel userModel) {
        int ans=0;
        UserModel userModel1= userRepository.save(userModel);
        if (!userModel.equals(null)){
            ans=1;
        }
        return ans;
    }

    @Override
    public void delete(Long Id) {

    }
}
