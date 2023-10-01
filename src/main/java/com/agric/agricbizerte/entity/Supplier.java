package com.agric.agricbizerte.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private Long phone;

    @Column(name = "share_annual")
    private String shareAnnual;
    @OneToMany(mappedBy="supplier")
    private Set<SupplyProcess> supplyProcess;
    public Supplier(){}
    public Supplier(Long id, String name, String address, Long phone, String shareAnnual, Set<SupplyProcess> supplyProcess){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.shareAnnual = shareAnnual;
        this.supplyProcess = supplyProcess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getShareAnnual() {
        return shareAnnual;
    }

    public void setShareAnnual(String shareAnnual) {
        this.shareAnnual = shareAnnual;
    }

    public Set<SupplyProcess> getSupplyProcess() {
        return supplyProcess;
    }

    public void setSupplyProcess(Set<SupplyProcess> supplyProcess) {
        this.supplyProcess = supplyProcess;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
