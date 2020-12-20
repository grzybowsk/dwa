package com.grzybowski.mateusz.vehicle.fullVehicleAplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/employees")
	public String goHome(){
		return "employee";
	}
}
