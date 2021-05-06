package com.example.sadi_A2.controller;

import com.example.sadi_A2.model.Provider;
import com.example.sadi_A2.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProviderController {
    @Autowired
    ProviderService providerService;

    @RequestMapping(path = "/providers", method = RequestMethod.GET)
    public List<Provider> getAllProviders(){
        return providerService.getAllProviders();
    }

    @RequestMapping(path = "/providers", method = RequestMethod.POST)
    public void addProvider(@RequestBody Provider provider){
        providerService.addProvider(provider);
    }

    @RequestMapping(path = "/providers", method = RequestMethod.PUT)
    public void updateProvider(@RequestBody Provider provider){
        providerService.updateProvider(provider);
    }

    @RequestMapping(path = "/providers", method = RequestMethod.DELETE)
    public void deleteProvider(@RequestBody Provider provider){
        providerService.deleteProvider(provider);
    }
}
