package com.grzybowski.mateusz.vehicle.fullVehicleAplication.controllers;



import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Location;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.services.CountryService;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.services.LocationService;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;

	@GetMapping("/locations")
	public String findAll(Model model){
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		return "location";
	}

	@GetMapping("/findById")
	@ResponseBody
	public Optional<Location> findById(Integer id) {
		return locationService.findById(id);
	}

	@GetMapping("/findByDescriptionContaining/{description}")
	public List<Location> findByDescriptionContaining(@PathVariable("description") String description) {
		return locationService.findByDescriptionContaining(description);
	}

	@PostMapping("/addNew")
	public String save(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteById(Integer id) {
		locationService.deleteById(id);
		return "redirect:/locations";
	}

}



