package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleMake;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleMakeService {
	
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	public List<VehicleMake> findAll(){
		return vehicleMakeRepository.findAll();
	}
    public Optional<VehicleMake> findById(int id) {
        return vehicleMakeRepository.findById(id);
    }

    public void delete(int id) {
        vehicleMakeRepository.deleteById(id);
    }

    public void save(VehicleMake vehicleMake) {
        vehicleMakeRepository.save(vehicleMake);
    }


}
