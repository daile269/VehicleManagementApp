package com.springbootapp.vehicleapp.security.controllers;

import com.springbootapp.vehicleapp.models.User;
import com.springbootapp.vehicleapp.security.models.Role;
import com.springbootapp.vehicleapp.security.service.RoleService;
import com.springbootapp.vehicleapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @GetMapping("role")
    public String getAll(Model model){
        model.addAttribute("roles",roleService.getRoles());
        return "role";
    }

    @PostMapping("role/addRole")
    public String addRole(Role role){
        roleService.saveRole(role);
        return "redirect:/role";
    }

    @RequestMapping(value = "role/findById")
    @ResponseBody
    public Role findById(Long id){
        return roleService.getRoleById(id);
    }

    @RequestMapping(value = "role/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String updateRole(Role role){
        roleService.saveRole(role);
        return "redirect:/role";
    }

    @RequestMapping(value = "role/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteRole(Long id){
        roleService.deleteRole(id);
        return "redirect:/role";
    }
    @GetMapping (value = "/security/user/Edit/{id}")
    public String editEmployee(Model model, @PathVariable Long id){
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        model.addAttribute("userRoles", roleService.getUserRoles(user));
        model.addAttribute("userNotRoles", roleService.getUserNotRoles(user));
        return "userEdit";
    }


    @RequestMapping("/role/assign/{userId}/{roleId}")
    public String assignRole(@PathVariable Long userId,
                             @PathVariable Long roleId){
        roleService.assignUserRole(userId, roleId);
        return "redirect:/security/user/Edit/"+userId;
    }
    @RequestMapping("/role/unassign/{userId}/{roleId}")
    public String unassignRole(@PathVariable Long userId,
                               @PathVariable Long roleId){
        roleService.unassignUserRole(userId, roleId);
        return "redirect:/security/user/Edit/"+userId;
    }

}
