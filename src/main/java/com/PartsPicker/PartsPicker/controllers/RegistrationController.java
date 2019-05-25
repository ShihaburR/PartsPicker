package com.PartsPicker.PartsPicker.controllers;

import com.PartsPicker.PartsPicker.domain.PCUser;
import com.PartsPicker.PartsPicker.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    //defined the interface
    private final RegistrationService registrationService;

    //constructor for interface
    @Autowired
    public RegistrationController(RegistrationService registrationService){
        this.registrationService = registrationService;
    }

    //run java code on HTML website
    //retrieve data from server
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegisterForm(){
        return new ModelAndView("register","PCUser", new PCUser());
    }

    //create login details on server and show profile
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegisterForm(PCUser pcUser){
        pcUser.setEnabled(Boolean.TRUE);
        pcUser.setAuthority("ROLE_USER");
        registrationService.addUser(pcUser);
        return "redirect:/profile";
    }
}
