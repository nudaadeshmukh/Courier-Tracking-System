package com.example.courier.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TrackingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private String location;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "parcel_id")
    private Parcel parcel;

    public TrackingHistory() {}

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public void setParcel(Parcel parcel) { this.parcel = parcel; }
}
