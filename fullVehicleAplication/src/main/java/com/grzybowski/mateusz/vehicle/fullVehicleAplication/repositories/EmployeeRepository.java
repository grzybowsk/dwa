package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;


import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
