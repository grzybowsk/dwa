package com.grzybowski.mateusz.vehicle.fullVehicleAplication;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class SpringSecurityAuditorAware implements AuditorAware  {
    @Override
    public Optional<String> getCurrentAuditor() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String usernae = authentication.getName();

        return Optional.ofNullable("Kindson").filter(s -> !s.isEmpty());
    }
}
