package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.User;
import com.springbootapp.vehicleapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getUsers(Model model){
        List<User> userList = userService.getUsers();
        model.addAttribute("users",userList);
        return "user";
    }
    @PostMapping("/addUser")
    public RedirectView addUser(User user, RedirectAttributes redirect){
        userService.saveUser(user);
        RedirectView redirectView = new RedirectView("/login",true);
        redirect.addFlashAttribute("message","You successfully registered! You can login now");
        return redirectView;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public User addUser(Long id){
        return userService.findUserById(id);
    }
    @RequestMapping(value = "update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateUser(User user){
        userService.saveUser(user);
        return "redirect:/user";
    }

    @RequestMapping(value = "delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteUser(Long id){
        userService.deleteUser(id);
        return "redirect:/user";
    }

}
