package com.agric.agricbizerte.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "supplyProcess")
public class SupplyProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supply_process_id")
    private Long id;

    @Column(name = "date")
    private Date date;
    @Column(name = "nbre_heads")
    private Long nbreHeads;
    @ManyToOne
    @JoinColumn(name="supplier_id", nullable=false)
    private Supplier supplier;

    public SupplyProcess(Long id, Date date, Long nbreHeads, Supplier supplier) {
        this.id = id;
        this.date = date;
        this.nbreHeads = nbreHeads;
        this.supplier = supplier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getNbreHeads() {
        return nbreHeads;
    }

    public void setNbreHeads(Long nbreHeads) {
        this.nbreHeads = nbreHeads;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
