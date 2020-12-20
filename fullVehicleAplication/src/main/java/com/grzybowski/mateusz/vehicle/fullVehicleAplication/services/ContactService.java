package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;


import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Contact;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public Optional<Contact> findById(int id) {
        return contactRepository.findById(id);
    }

    public void delete(int id) {
        contactRepository.deleteById(id);
    }

    public void save( Contact contact) {
        contactRepository.save(contact);
    }

}