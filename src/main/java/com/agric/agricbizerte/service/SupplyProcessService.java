package com.agric.agricbizerte.service;

import com.agric.agricbizerte.entity.SupplyProcess;
import com.agric.agricbizerte.repository.ISupplyProcessRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplyProcessService implements ISupplyProcessService {
    private final ISupplyProcessRepository supplyProcessRepository;

    public SupplyProcessService(ISupplyProcessRepository supplyProcessRepository) {
        this.supplyProcessRepository = supplyProcessRepository;
    }

    @Override
    public List<SupplyProcess> findAllBySuplierId(Long id) {
        return supplyProcessRepository.getBySupplierId(id);
    }

    @Override
    public Optional<SupplyProcess> findById(Long id) {
        return supplyProcessRepository.findById(id);
    }

    @Override
    public SupplyProcess saveSupplyProcess(SupplyProcess supplyProcess) {
        return supplyProcessRepository.save(supplyProcess);
    }

    @Override
    public SupplyProcess updateSupplyProcess(SupplyProcess supplyProcess) {
        return supplyProcessRepository.save(supplyProcess);
    }

    @Override
    public void deleteSupplyProcess(Long id) {
        supplyProcessRepository.deleteById(id);
    }
}
