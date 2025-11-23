package com.pradyumna.project.uber.uberApp.strategies.impl;

import com.pradyumna.project.uber.uberApp.dto.RideRequestDto;
import com.pradyumna.project.uber.uberApp.entities.Driver;
import com.pradyumna.project.uber.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
