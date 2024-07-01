package com.swapnil.AirlineService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String airline(Model theModel){
        theModel.addAttribute("theData","Welcome to Cricket Space Airline");
        theModel.addAttribute("startJourney","from");
        theModel.addAttribute("endJourney","to");
        theModel.addAttribute("travelDate","Travelling-Dates");

        return "airLineServices";

    }
}
