package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Contact;
import com.springbootapp.vehicleapp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }
    public void saveContact(Contact contact){
        contactRepository.save(contact);
    }
    public Optional<Contact> findById(Long id){
        return contactRepository.findById(id);
    }

    public void deleteContact(Long id){
        contactRepository.deleteById(id);
    }
}
