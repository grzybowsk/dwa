package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;


import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleStatus;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {
	
	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;


    public List<VehicleStatus> findAll(){
        return vehicleStatusRepository.findAll();
    }

    public Optional<VehicleStatus> findById(int id) {
        return vehicleStatusRepository.findById(id);
    }

    public void delete(int id) {
        vehicleStatusRepository.deleteById(id);
    }

    public void save( VehicleStatus invoiceStatus) {
        vehicleStatusRepository.save(invoiceStatus);
    }


}
