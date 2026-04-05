package com.example.courier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.courier.model.TrackingHistory;

public interface TrackingRepository extends JpaRepository<TrackingHistory, Long> {
}
