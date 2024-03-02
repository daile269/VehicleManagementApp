package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.Country;
import com.springbootapp.vehicleapp.models.Client;
import com.springbootapp.vehicleapp.models.State;
import com.springbootapp.vehicleapp.services.CountryService;
import com.springbootapp.vehicleapp.services.ClientService;
import com.springbootapp.vehicleapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping
    public String getClient(Model model){
        List<Client> ClientList = clientService.getClients();
        model.addAttribute("client",ClientList);
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        List<State> stateList = stateService.getState();
        model.addAttribute("state",stateList);
        return "client";
    }

    @PostMapping("/addClient")
    public String addNewState(Client Client){
        clientService.saveClient(Client);
        return "redirect:/client";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<Client> findByID(Long id){
        return clientService.getClientByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateClient(Client Client){
        clientService.saveClient(Client);
        return "redirect:/client";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteClient(Long id){
        clientService.deleteClient(id);
        return "redirect:/client";
    }
}
