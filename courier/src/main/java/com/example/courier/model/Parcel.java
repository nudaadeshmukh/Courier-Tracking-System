package com.example.courier.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trackingId;
    private String sender;
    private String receiver;

    @OneToMany(mappedBy = "parcel", cascade = CascadeType.ALL)
    private List<TrackingHistory> history = new ArrayList<>();

    public Parcel() {}

    public Long getId() { return id; }

    public String getTrackingId() { return trackingId; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }

    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

    public String getReceiver() { return receiver; }
    public void setReceiver(String receiver) { this.receiver = receiver; }

    public List<TrackingHistory> getHistory() { return history; }
}
