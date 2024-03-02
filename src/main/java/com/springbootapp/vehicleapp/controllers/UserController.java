package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.User;
import com.springbootapp.vehicleapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

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

    @RequestMapping("/findUserById")
    @ResponseBody
    public Optional<User> addUser(Long id){
        return userService.getUserById(id);
    }
    @RequestMapping(value = "updateUser",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateUser(User user){
        userService.saveUser(user);
        return "redirect:/user";
    }

    @RequestMapping(value = "deleteUser",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteUser(Long id){
        userService.deleteUser(id);
        return "redirect:/user";
    }

}
