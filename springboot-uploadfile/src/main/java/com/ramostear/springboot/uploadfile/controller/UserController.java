package com.ramostear.springboot.uploadfile.controller;

import com.ramostear.springboot.uploadfile.model.UserModel;
import com.ramostear.springboot.uploadfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/listar")
    public String list(Model model){
        List<UserModel>listUser= userService.list();
        model.addAttribute("personas",listUser);
        return "index";
    }
    @PostMapping("/save")
    public String save(UserModel userModel, Model model){
        userService.save(userModel);
        return "redirect:/listar";
    }

}
