package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.State;
import com.springbootapp.vehicleapp.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;
    public List<State> getState(){
        return stateRepository.findAll();
    }

    public void saveState(State state){
        stateRepository.save(state);
    }

    public Optional<State> findById(Long id){
        return stateRepository.findById(id);
    }

    public void deleteState(Long id){
        stateRepository.deleteById(id);
    }
}
