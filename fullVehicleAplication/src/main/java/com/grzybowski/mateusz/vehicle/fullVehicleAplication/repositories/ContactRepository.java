package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
