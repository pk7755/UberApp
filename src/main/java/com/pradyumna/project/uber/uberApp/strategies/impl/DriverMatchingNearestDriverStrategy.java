package com.pradyumna.project.uber.uberApp.strategies.impl;

import com.pradyumna.project.uber.uberApp.dto.RideRequestDto;
import com.pradyumna.project.uber.uberApp.entities.Driver;
import com.pradyumna.project.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
