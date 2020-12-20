package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleHire;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleHireService {

    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    public List<VehicleHire> findAll(){
        return vehicleHireRepository.findAll();
    }

    public Optional<VehicleHire> findById(int id) {
        return vehicleHireRepository.findById(id);
    }

    public void delete(int id) {
        vehicleHireRepository.deleteById(id);
    }

    public void save(VehicleHire vehicleHire) {
        vehicleHireRepository.save(vehicleHire);
    }

}