package com.example.courier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.courier.model.Parcel;
import java.util.Optional;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {
    Optional<Parcel> findByTrackingId(String trackingId);
}
