package com.example.courier.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.*;
import com.example.courier.model.*;
import com.example.courier.repository.*;

@Service
public class ParcelService {

    private final ParcelRepository parcelRepo;
    private final TrackingRepository trackingRepo;

    public ParcelService(ParcelRepository parcelRepo, TrackingRepository trackingRepo) {
        this.parcelRepo = parcelRepo;
        this.trackingRepo = trackingRepo;
    }

    public Parcel createParcel(Parcel parcel) {
        parcel.setTrackingId(UUID.randomUUID().toString());
        return parcelRepo.save(parcel);
    }

    public TrackingHistory updateStatus(String trackingId, String status, String location) {
        Parcel parcel = parcelRepo.findByTrackingId(trackingId)
                .orElseThrow(() -> new RuntimeException("Parcel not found"));

        TrackingHistory history = new TrackingHistory();
        history.setStatus(status);
        history.setLocation(location);
        history.setTimestamp(LocalDateTime.now());
        history.setParcel(parcel);

        return trackingRepo.save(history);
    }

    public List<TrackingHistory> trackParcel(String trackingId) {
        Parcel parcel = parcelRepo.findByTrackingId(trackingId)
                .orElseThrow(() -> new RuntimeException("Parcel not found"));

        return parcel.getHistory();
    }
}
