package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.User;
import com.springbootapp.vehicleapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User findUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    public void saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
