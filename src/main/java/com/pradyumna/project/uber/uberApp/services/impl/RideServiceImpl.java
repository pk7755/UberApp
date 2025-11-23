package com.pradyumna.project.uber.uberApp.services.impl;

import com.pradyumna.project.uber.uberApp.dto.RideRequestDto;
import com.pradyumna.project.uber.uberApp.entities.Driver;
import com.pradyumna.project.uber.uberApp.entities.Ride;
import com.pradyumna.project.uber.uberApp.entities.enums.RideStatus;
import com.pradyumna.project.uber.uberApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
