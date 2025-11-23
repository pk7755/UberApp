package com.pradyumna.project.uber.uberApp.dto;

import com.pradyumna.project.uber.uberApp.entities.Rider;
import com.pradyumna.project.uber.uberApp.entities.enums.PaymentMethod;
import com.pradyumna.project.uber.uberApp.entities.enums.RideRequestStatus;
import com.pradyumna.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
public class RideRequestDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
}
