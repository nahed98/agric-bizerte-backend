package com.agric.agricbizerte.entity;


import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "bovins")
public class Bovin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bovin_id")
    private Long id;
    @Column(name = "bovin_idf")

    private String bovinId;
    @Column(name = "state")

    private String state;
    @ManyToOne
    @JoinColumn(name="`breeder_id`", nullable=true)
    private Breeder breeder;
    @Column(name = "breeder_name")

    private String breederName;
    @Column(name = "race")

    private String typeRacial;
    @Column(name = "location")

    private String location;
    @Column(name = "gps_coordinate")

    private String gpsCoordinate;
    @Column(name = "saved_date")

    private String savedDate;

    @ManyToOne
    @JoinColumn(name="`supplier_id`", nullable=true)
    private Supplier Supplier;
    @Column(name = "destination")
    private String Destination;  // supplier links



    public Bovin(){}
    public Bovin(Long id, String state, String breederName,  String bovinId, String typeRacial,  Breeder breeder, String location, String gpsCoordinate, String savedDate, com.agric.agricbizerte.entity.Supplier supplier, String destination) {
        this.id = id;
        this.state = state;
        this.breederName = breederName;
        this.bovinId = bovinId;
        this.typeRacial = typeRacial;
        this.breeder = breeder;
        this.location = location;
        this.gpsCoordinate = gpsCoordinate;
        this.savedDate = savedDate;
        Supplier = supplier;
        Destination = destination;
    }





    public String getTypeRacial() {
        return typeRacial;
    }

    public void setTypeRacial(String typeRacial) {
        this.typeRacial = typeRacial;
    }



    public String getBovinId() {
        return bovinId;
    }

    public void setBovinId(String bovinId) {
        this.bovinId = bovinId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Breeder getBreeder() {
        return breeder;
    }

    public void setBreeder(Breeder breeder) {
        this.breeder = breeder;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGpsCoordinate() {
        return gpsCoordinate;
    }

    public void setGpsCoordinate(String gpsCoordinate) {
        this.gpsCoordinate = gpsCoordinate;
    }

    public String getBreederName() {
        return breederName;
    }

    public void setBreederName(String breederName) {
        this.breederName = breederName;
    }

    public String getSavedDate() {
        return savedDate;
    }

    public void setSavedDate(String savedDate) {
        this.savedDate = savedDate;
    }

    public com.agric.agricbizerte.entity.Supplier getSupplier() {
        return Supplier;
    }

    public void setSupplier(com.agric.agricbizerte.entity.Supplier supplier) {
        Supplier = supplier;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
