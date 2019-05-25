package com.PartsPicker.PartsPicker.controllers;


import com.PartsPicker.PartsPicker.domain.CreatePC;
import com.PartsPicker.PartsPicker.services.CreatePCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreatePCController {
    private final CreatePCService createPCService;

    @Autowired
    public CreatePCController(CreatePCService createPCService){
    this.createPCService = createPCService;
    }

    //show the Work PC Details Form
    @RequestMapping(value = "buildWorkPC", method = RequestMethod.GET )
    public ModelAndView showWorkPC(){
        CreatePC createPC = new CreatePC();
        return new ModelAndView("buildWorkPC","createPC", createPC);
    }

    @RequestMapping(value = "buildGamingPC", method = RequestMethod.GET )
    public ModelAndView showGamingPC(){
        CreatePC createPC = new CreatePC();
        return new ModelAndView("buildGamingPC","createPC", createPC);
    }

    @RequestMapping(value="/madePC", method= RequestMethod.GET)
    public ModelAndView showPCs(){
        return new ModelAndView("madePC","createPC", createPCService.getPCs());
    }

    @RequestMapping(value = "/buildPC", method = RequestMethod.POST)
    public String processCreatePC(CreatePC createPC){
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        createPC.setEmail(email);
        createPCService.addCreatedPC(createPC);
        return "redirect:/profile";
    }
}

