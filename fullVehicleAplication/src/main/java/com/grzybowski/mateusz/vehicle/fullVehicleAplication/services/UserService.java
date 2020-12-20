package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;
import java.util.Optional;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.User;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {



        @Autowired
        private UserRepository userRepository;

        public List<User> findAll(){
            return userRepository.findAll();
        }

        public Optional<User> findById(int id) {
            return userRepository.findById(id);
        }

        public void delete(int id) {
            userRepository.deleteById(id);
        }

        public void save(User user) {
            userRepository.save(user);
        }


}
