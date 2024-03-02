package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Country;
import com.springbootapp.vehicleapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
    public void saveCountry(Country country){
        countryRepository.save(country);
    }
    public Optional<Country> findById(Long id){
        return countryRepository.findById(id);
    }

    public void deleteCoutry(Long id){
        countryRepository.deleteById(id);
    }
}
