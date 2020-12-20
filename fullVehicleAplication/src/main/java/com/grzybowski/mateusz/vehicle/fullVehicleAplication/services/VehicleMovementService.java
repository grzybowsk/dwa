package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleMovement;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleMovementService {

    @Autowired
    private VehicleMovementRepository vehicleMovementRepository;

    public List<VehicleMovement> findAll(){
        return vehicleMovementRepository.findAll();
    }

    public Optional<VehicleMovement> findById(int id) {
        return vehicleMovementRepository.findById(id);
    }

    public void delete(int id) {
        vehicleMovementRepository.deleteById(id);
    }

    public void save(VehicleMovement vehicleMovement) {
        vehicleMovementRepository.save(vehicleMovement);
    }

}