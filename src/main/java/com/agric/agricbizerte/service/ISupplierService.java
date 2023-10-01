package com.agric.agricbizerte.service;

import com.agric.agricbizerte.entity.Supplier;

import java.util.List;
import java.util.Optional;

public interface ISupplierService {
    List<Supplier> findAllSuppliers();
    Optional<Supplier> findById(Long id);
    Supplier saveSupplier(Supplier supplier);
    Supplier updateSupplier(Supplier supplier);
    void deleteSupplier(Long id);
}
