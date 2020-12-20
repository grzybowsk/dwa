package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;


import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
