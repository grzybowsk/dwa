package com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
