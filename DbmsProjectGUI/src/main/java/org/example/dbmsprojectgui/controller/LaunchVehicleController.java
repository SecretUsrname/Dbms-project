package org.example.dbmsprojectgui.controller;

import org.example.dbmsprojectgui.service.LaunchVehicleService;
import org.example.dbmsprojectgui.model.Launchvehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/launch-vehicles")
public class LaunchVehicleController {
    private final LaunchVehicleService launchVehicleService;

    @Autowired
    public LaunchVehicleController(LaunchVehicleService launchVehicleService) {
        this.launchVehicleService = launchVehicleService;
    }

    @GetMapping("/new")
    public String newLaunchVehicleForm() {
        return "new-launch-vehicle";
    }

    @PostMapping("/create")
    public String createLaunchVehicle(Launchvehicle launchVehicle) {
        launchVehicleService.saveLaunchVehicle(launchVehicle);
        return "Success.html"; // Redirect back to the form or to a success page
    }
}
