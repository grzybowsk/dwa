package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
	
}
