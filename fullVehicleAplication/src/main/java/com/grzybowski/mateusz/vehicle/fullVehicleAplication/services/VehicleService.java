
package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Vehicle;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	public List<Vehicle> findAll(){
		return vehicleRepository.findAll();
	}

    public Optional<Vehicle> findById(int id) {
        return vehicleRepository.findById(id);
    }

    public void delete(int id) {
        vehicleRepository.deleteById(id);
    }

    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

}

