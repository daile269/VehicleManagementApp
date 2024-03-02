package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.Contact;
import com.springbootapp.vehicleapp.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public String getCountries(Model model){
        List<Contact> contactList = contactService.getContacts();
        model.addAttribute("contacts",contactList);
        return "contact";
    }

    @PostMapping("/addContact")
    public String addNewContact(Contact contact){
        contactService.saveContact(contact);
        return "redirect:/contact";
    }

    @RequestMapping ("/findById")
    @ResponseBody
    public Optional<Contact> findByID(Long id){
        return contactService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateContact(Contact contact){
        contactService.saveContact(contact);
        return "redirect:/contact";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteContact(Long id){
        contactService.deleteContact(id);
        return "redirect:/contact";
    }
}
