package com.example.courier.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.courier.model.*;
import com.example.courier.service.ParcelService;

@RestController
@RequestMapping("/courier")
public class ParcelController {

    private final ParcelService service;

    public ParcelController(ParcelService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Parcel create(@RequestBody Parcel parcel) {
        return service.createParcel(parcel);
    }

    @PostMapping("/update")
    public TrackingHistory update(@RequestParam String trackingId,
                                  @RequestParam String status,
                                  @RequestParam String location) {
        return service.updateStatus(trackingId, status, location);
    }

    @GetMapping("/track/{trackingId}")
    public List<TrackingHistory> track(@PathVariable String trackingId) {
        return service.trackParcel(trackingId);
    }
}
