package com.edgetech.autodealer.controller;

import com.edgetech.autodealer.model.Automobile;
import com.edgetech.autodealer.service.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutomobileController {

    @Autowired
    private AutomobileService autoService;

    @GetMapping("/auto/{make}")
    public List<Automobile> getAutosByMake(@PathVariable String make) {
        return autoService.getAutomobileByMake(make);
    }

    @GetMapping("/auto/makes")
    public List<String> getMakes() {
        return autoService.getAllMakes();
    }

}
