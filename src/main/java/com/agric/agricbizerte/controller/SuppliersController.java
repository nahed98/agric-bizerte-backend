package com.agric.agricbizerte.controller;

import com.agric.agricbizerte.entity.Supplier;
import com.agric.agricbizerte.service.ISupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/suppliers")
public class SuppliersController {
    private final ISupplierService supplierService;

    public SuppliersController(ISupplierService supplierService) {
        this.supplierService = supplierService;
    }
    @GetMapping
    public List<Supplier> findAllSuppliers() {
        return supplierService.findAllSuppliers();
    }

    @GetMapping("/{id}")
    public Optional<Supplier> findSupplierById(@PathVariable("id") Long id) {
        return supplierService.findById(id);
    }

    @PostMapping
    public Supplier saveSupplier(@RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }

    @PutMapping
    public Supplier updateSupplier(@RequestBody Supplier supplier)  {return supplierService.updateSupplier(supplier);}

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable("id") Long id) {
        supplierService.deleteSupplier(id);
    }

}
