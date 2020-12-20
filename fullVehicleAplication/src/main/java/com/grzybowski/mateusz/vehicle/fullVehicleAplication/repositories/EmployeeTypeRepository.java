package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
