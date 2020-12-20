package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer>{
	
    
}
