package org.example.dbmsprojectgui.controller;

import org.example.dbmsprojectgui.service.LaunchEventService;
import org.example.dbmsprojectgui.model.Launchevent;
import org.example.dbmsprojectgui.service.LaunchVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/launches")
public class LaunchController {
    private final LaunchEventService launchEventService;
    @Autowired
    private LaunchVehicleService launchVehicleService;

    @Autowired
    public LaunchController(LaunchEventService launchEventService) {
        this.launchEventService = launchEventService;
    }

    @GetMapping("/schedule")
    public String scheduleLaunchForm() {
        return "schedule-launch";
    }

    @PostMapping("/scheduleCreate")
    public String scheduleLaunch(Launchevent launchEvent) {
        launchEventService.saveLaunchEvent(launchEvent);
        return "SuccessEvent.html";
    }

    @GetMapping("/dates")
    public String ShowDateForm()
    {
        return "success-details";
    }

    @GetMapping("/dates/launch-success-details")
    public String getLaunchSuccessDetails(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate, Model model) {
        if (startDate == null || endDate == null) {
            return "success-details"; // Just show the form if the dates are null
        }
        java.sql.Date sdate = new java.sql.Date(startDate.getTime());
        java.sql.Date edate = new java.sql.Date(endDate.getTime());
        List<Object[]> details = launchVehicleService.getSuccessDetails(sdate, edate);
        model.addAttribute("details", details); // Adding the results to the model
        return "success-details"; // Return the same view with the results
    }


}

