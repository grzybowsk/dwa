package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.InvoiceStatus;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {
	
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
	
	public List<InvoiceStatus> findAll(){
		return invoiceStatusRepository.findAll();
	}

	public Optional<InvoiceStatus> findById(int id) {
        return invoiceStatusRepository.findById(id);
    }

    public void delete(int id) {
        invoiceStatusRepository.deleteById(id);
    }

    public void save( InvoiceStatus invoiceStatus) {
        invoiceStatusRepository.save(invoiceStatus);
    }

}
