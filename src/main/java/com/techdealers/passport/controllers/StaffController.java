package com.techdealers.passport.controllers;

import com.techdealers.passport.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }


    @GetMapping("/staff/all")
    public String allStaff(Model model) {
        model.addAttribute("staff", staffService.getAll());

        return "index";
    }
}
