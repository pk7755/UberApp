package com.pradyumna.project.uber.uberApp.services;

import com.pradyumna.project.uber.uberApp.dto.DriverDto;
import com.pradyumna.project.uber.uberApp.dto.RideDto;
import com.pradyumna.project.uber.uberApp.dto.RideRequestDto;
import com.pradyumna.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RiderDto> getAllMyRides();
}
