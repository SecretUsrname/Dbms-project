package org.example.dbmsprojectgui.controller;

import org.example.dbmsprojectgui.model.SatelliteDetails;
import org.example.dbmsprojectgui.service.SatelliteService;
import org.example.dbmsprojectgui.model.Satellite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SatelliteController {
    @Autowired
    private final SatelliteService satelliteService;

    @Autowired
    public SatelliteController(SatelliteService satelliteService) {
        this.satelliteService = satelliteService;
    }

    @GetMapping("/satellites")
    public String viewSatelliteForm() {
        return "satellites";
    }

    @GetMapping("/satellites/details")
    public String getSatelliteDetails(@RequestParam Integer id, Model model) {
        Satellite satellite = satelliteService.findSatelliteById(id);
        model.addAttribute("satellite", satellite);
        return "satellite-details"; // Create this Thymeleaf template to display the details
    }
    @GetMapping("/satellites/deletedetails")
    public String deleteSatelliteDetails(@RequestParam Integer id, Model model) {
        satelliteService.deleteSatellite(id);
        return "Success.html";
    }
    @GetMapping("/satellites/orbit-type")
    public String showOrbitTypeForm() {
        return "orbit-type-form";
    }

    @GetMapping("/satellites/orbit-type-results")
    public String getSatellitesByOrbitType(@RequestParam("OType") String orbitType, Model model) {
        List<SatelliteDetails> satellites = satelliteService.getSatellitesByOrbitType(orbitType);
        model.addAttribute("satellites", satellites);
        return "orbit-type-results";
    }

}
