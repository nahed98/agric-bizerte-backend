package com.agric.agricbizerte.repository;

import com.agric.agricbizerte.entity.Breeder;
import com.agric.agricbizerte.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISupplierRepository extends JpaRepository<Supplier, Long> {
}
