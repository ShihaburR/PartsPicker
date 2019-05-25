package com.PartsPicker.PartsPicker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PartsPickerController {
    //Display the websites via mapping websites to values
    @RequestMapping(value = "/")
    public ModelAndView showHome(){
        return new ModelAndView("index");
    }
    @RequestMapping(value = "/accessories")
    public ModelAndView showAccessories(){
        return new ModelAndView("accessories");
    }
    @RequestMapping(value = "/buildPC")
    public ModelAndView showBuildPC(){
        return new ModelAndView("budget");
    }
    @RequestMapping(value = "/customisePC")
    public ModelAndView showCustomisePC(){
        return new ModelAndView("customisePC");
    }
}
