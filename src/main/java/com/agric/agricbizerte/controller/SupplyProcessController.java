package com.agric.agricbizerte.controller;

import com.agric.agricbizerte.entity.SupplyProcess;
import com.agric.agricbizerte.service.ISupplyProcessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/supplyProcess")
public class SupplyProcessController {
    private final ISupplyProcessService supplyProcessService;

    public SupplyProcessController(ISupplyProcessService supplyProcessService) {
        this.supplyProcessService = supplyProcessService;
    }
    @GetMapping
    public List<SupplyProcess> findAllBySupplierId(@RequestBody Long supplierId) {
        return supplyProcessService.findAllBySuplierId(supplierId);
    }

    @GetMapping("/{id}")
    public Optional<SupplyProcess> findSupplierById(@PathVariable("id") Long id) {
        return supplyProcessService.findById(id);
    }

    @PostMapping
    public SupplyProcess saveSupplier(@RequestBody SupplyProcess supplyProcess) {
        return supplyProcessService.saveSupplyProcess(supplyProcess);
    }

    @PutMapping
    public SupplyProcess updateSupplier(@RequestBody SupplyProcess supplyProcess)  {
        return supplyProcessService.updateSupplyProcess(supplyProcess);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable("id") Long id) {
        supplyProcessService.deleteSupplyProcess(id);
    }

}
