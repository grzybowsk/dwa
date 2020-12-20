package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Invoice;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public List<Invoice> findAll(){
		return invoiceRepository.findAll();
	}

    public Optional<Invoice> findById(int id) {
        return invoiceRepository.findById(id);
    }

    public void delete(int id) {
        invoiceRepository.deleteById(id);
    }

    public void save(Invoice invoice) {
        invoiceRepository.save(invoice);
    }


}
