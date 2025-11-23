package com.pradyumna.project.uber.uberApp.services.impl;

import com.pradyumna.project.uber.uberApp.dto.DriverDto;
import com.pradyumna.project.uber.uberApp.dto.RideDto;
import com.pradyumna.project.uber.uberApp.dto.RideRequestDto;
import com.pradyumna.project.uber.uberApp.dto.RiderDto;
import com.pradyumna.project.uber.uberApp.services.RiderService;

import java.util.List;

public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RiderDto> getAllMyRides() {
        return List.of();
    }
}
