package com.pradyumna.project.uber.uberApp.strategies;

import com.pradyumna.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);


}
