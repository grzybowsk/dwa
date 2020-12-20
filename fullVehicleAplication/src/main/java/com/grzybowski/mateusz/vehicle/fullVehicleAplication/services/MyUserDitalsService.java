package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;


import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.User;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.UserPrincipal;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDitalsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("User not found");
        }
    return new UserPrincipal(user);
    }

}
