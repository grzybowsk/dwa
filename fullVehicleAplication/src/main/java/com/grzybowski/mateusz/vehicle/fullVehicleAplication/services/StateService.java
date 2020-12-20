package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.State;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	public List<State> findAll(){
		return stateRepository.findAll();
	}

    public Optional<State> findById(int id) {
        return stateRepository.findById(id);
    }

    public void delete(int id) {
        stateRepository.deleteById(id);
    }

    public void save( State state) {
        stateRepository.save(state);
    }

}
