package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;


import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {}
