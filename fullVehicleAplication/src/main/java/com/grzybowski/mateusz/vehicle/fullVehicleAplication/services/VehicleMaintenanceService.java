package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleMaintenance;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;



@Service
public class VehicleMaintenanceService {

    @Autowired
    private VehicleMaintenanceRepository vehicleMaintenanceRepository;

    public List<VehicleMaintenance> findAll(){
        return vehicleMaintenanceRepository.findAll();
    }

    public Optional<VehicleMaintenance> findById(int id) {
        return vehicleMaintenanceRepository.findById(id);
    }

    public void delete(int id) {
        vehicleMaintenanceRepository.deleteById(id);
    }

    public void save(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }
}