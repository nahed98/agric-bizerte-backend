package com.agric.agricbizerte.service;

import com.agric.agricbizerte.entity.SupplyProcess;
import java.util.List;
import java.util.Optional;

public interface ISupplyProcessService {
    List<SupplyProcess> findAllBySuplierId(Long id);
    Optional<SupplyProcess> findById(Long id);
    SupplyProcess saveSupplyProcess(SupplyProcess supplyProcess);
    SupplyProcess updateSupplyProcess(SupplyProcess supplyProcess);
    void deleteSupplyProcess(Long id);
}
