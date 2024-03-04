package com.springbootapp.vehicleapp.security.service;

import com.springbootapp.vehicleapp.models.User;
import com.springbootapp.vehicleapp.repositories.UserRepository;
import com.springbootapp.vehicleapp.security.models.Role;
import com.springbootapp.vehicleapp.security.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }
    public Role getRoleById(Long id){
        return roleRepository.findById(id).orElse(null);
    }
    public void saveRole(Role role){
        roleRepository.save(role);
    }
    public void deleteRole(Long id){
        roleRepository.deleteById(id);
    }

    public void assignUserRole(Long userId, Long roleId){
        User user = userRepository.findById(userId).orElse(null);
        Role role = roleRepository.findById(roleId).orElse(null);

        List<Role> userRoles = user.getRoles();
        userRoles.add(role);
        user.setRoles(userRoles);
        userRepository.save(user);

    }
    public void unassignUserRole(Long userId, Long roleId){
        User user = userRepository.findById(userId).orElse(null);
        user.getRoles().removeIf(x -> (x.getId() == roleId) );
        userRepository.save(user);
    }
    public List<Role> getUserNotRoles(User user){
        return roleRepository.getUserNotRoles(user.getId());
    }

    public List<Role> getUserRoles(User user) {
        return user.getRoles();
    }
}
