package com.grzybowski.mateusz.vehicle.fullVehicleAplication.controllers;

import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleMovement;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.services.LocationService;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.services.VehicleMovementService;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VehicleMovementController {

	@Autowired private VehicleMovementService vehicleMovementService;
	@Autowired private LocationService locationService;
	@Autowired private VehicleService vehicleService;

	@GetMapping("vehicleMovements")
	public String findAll(Model model){
		model.addAttribute("vehicleMovements", vehicleMovementService.findAll());
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("vehicles", vehicleService.findAll());

		return "vehicleMovement";
	}

	@RequestMapping("vehicleMovements/findById")
	@ResponseBody
	public Optional<VehicleMovement> findById(Integer id)
	{
		return vehicleMovementService.findById(id);
	}

	@PostMapping(value="vehicleMovements/addNew")
	public String addNew(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehicleMovements";
	}

	@RequestMapping(value="vehicleMovements/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehicleMovements";
	}

	@RequestMapping(value="vehicleMovements/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleMovementService.delete(id);
		return "redirect:/vehicleMovements";
	}


}