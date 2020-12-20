package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.InvoiceStatus;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleModel;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleModelService {
	
	@Autowired
	private VehicleModelRepository vehicleModelRepository;


    public List<VehicleModel> findAll(){
        return vehicleModelRepository.findAll();
    }

    public Optional<VehicleModel> findById(int id) {
        return vehicleModelRepository.findById(id);
    }

    public void delete(int id) {
        vehicleModelRepository.deleteById(id);
    }

    public void save( VehicleModel invoiceStatus) {
        vehicleModelRepository.save(invoiceStatus);
    }
}
