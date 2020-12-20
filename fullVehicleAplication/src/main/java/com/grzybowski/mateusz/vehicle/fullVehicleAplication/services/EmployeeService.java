package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Employee;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
		
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	

}
