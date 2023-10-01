package com.agric.agricbizerte.entity;

import jakarta.persistence.*;
import java.util.Set;
@Entity
@Table(name = "breeders")
public class Breeder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "breeder_id")
    private Long id;

    @Column(name = "fullName")
    private String fullName;
    @Column(name = "address")
    private String address;
    @Column(name = "absorption_capacity")
    private Integer capacity;
    @Column(name = "phone")
    private Long phone;
    @OneToMany(mappedBy="breeder")
    private Set<Bovin> bovins;
    public Breeder(){}
    public Breeder(Long id, String fullName, String address, Integer capacity, Long phone, Set<Bovin> bovins) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.capacity = capacity;
        this.phone = phone;
        this.bovins = bovins;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Set<Bovin> getBovins() {
        return bovins;
    }

    public void setBovins(Set<Bovin> bovins) {
        this.bovins = bovins;
    }
}
