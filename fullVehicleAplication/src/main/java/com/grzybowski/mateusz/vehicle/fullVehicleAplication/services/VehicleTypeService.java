package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleType;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleTypeService {

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;

	public List<VehicleType> findAll(){
		return vehicleTypeRepository.findAll();
	}

	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRepository.findById(id);
	}

	public void delete(int id) {
		vehicleTypeRepository.deleteById(id);
	}

	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}

}
