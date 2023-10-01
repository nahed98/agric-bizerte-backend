package com.agric.agricbizerte.entity;


import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "bovins")
public class Bovin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "bovin_id")
    private String bovinId;
    @Column(name = "state")
    private String state;
    @ManyToOne
    @JoinColumn(name="breeder_id", nullable=true)
    private Breeder breeder;
    @Column(name = "breederName")
    private String breederName;
    @Column(name = "type_racial")
    private String typeRacial;
    @Column(name = "location")
    private String location;
    @Column(name = "gps_coordinate")
    private String gpsCoordinate;
    @Column(name = "saved_date")
    private String savedDate;

    @ManyToOne
    @JoinColumn(name="supplier_id", nullable=true)
    private Supplier Supplier;
    private String Destination;  // supplier links

    @Column(name = "sex")
    private String sex;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "end_date")
    private Date endDate;
    /*@Column(name = "work_number")
    private Integer workNumber;*/

    @Column(name = "name")
    private String name;
    @Column(name = "status_daughter")
    private boolean statusDaughter;
    @Column(name = "surrogate_mother")
    private Long surrogateMother; //foreign key
    @Column(name = "father_ipg")
    private Long fatherIPG;//foreign key


    public Bovin(){}
    public Bovin(Long id, String state, String breederName, String name, String sex, Date dateOfBirth, String bovinId, String typeRacial, Date endDate, boolean statusDaughter, Long surrogateMother, Long fatherIPG, Breeder breeder, String location, String gpsCoordinate, String savedDate, com.agric.agricbizerte.entity.Supplier supplier, String destination) {
        this.id = id;
        this.state = state;
        this.breederName = breederName;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.bovinId = bovinId;
        this.typeRacial = typeRacial;
        this.endDate = endDate;
        this.statusDaughter = statusDaughter;
        this.surrogateMother = surrogateMother;
        this.fatherIPG = fatherIPG;
        this.breeder = breeder;
        this.location = location;
        this.gpsCoordinate = gpsCoordinate;
        this.savedDate = savedDate;
        Supplier = supplier;
        Destination = destination;
    }


    public Long getFatherIPG() {
        return fatherIPG;
    }

    public void setFatherIPG(Long fatherIPG) {
        this.fatherIPG = fatherIPG;
    }

    public Long getSurrogateMother() {
        return surrogateMother;
    }

    public void setSurrogateMother(Long surrogateMother) {
        this.surrogateMother = surrogateMother;
    }

    public boolean isStatusDaughter() {
        return statusDaughter;
    }

    public void setStatusDaughter(boolean statusDaughter) {
        this.statusDaughter = statusDaughter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTypeRacial() {
        return typeRacial;
    }

    public void setTypeRacial(String typeRacial) {
        this.typeRacial = typeRacial;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
