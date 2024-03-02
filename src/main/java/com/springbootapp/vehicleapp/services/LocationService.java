package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Location;
import com.springbootapp.vehicleapp.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getLocations(){
        return locationRepository.findAll();
    }

    public void saveLocation(Location location){
        locationRepository.save(location);
    }
    public Optional<Location> getLocationByID(Long id){
        return locationRepository.findById(id);
    }
    public void deleteLocation(Long id){
        locationRepository.deleteById(id);
    }
}
