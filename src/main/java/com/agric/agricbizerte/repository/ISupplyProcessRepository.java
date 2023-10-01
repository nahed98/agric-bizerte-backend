package com.agric.agricbizerte.repository;

import com.agric.agricbizerte.entity.Supplier;
import com.agric.agricbizerte.entity.SupplyProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ISupplyProcessRepository extends JpaRepository<SupplyProcess, Long> {
    List<SupplyProcess> getBySupplierId(Long id);
}
