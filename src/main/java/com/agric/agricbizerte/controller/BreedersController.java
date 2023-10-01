package com.agric.agricbizerte.controller;

import com.agric.agricbizerte.entity.Breeder;
import com.agric.agricbizerte.service.BreederService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/breeders")
public class BreedersController {
    private final BreederService breederService;

    public BreedersController(BreederService breederService) {
        this.breederService = breederService;
    }
    @GetMapping
    public List<Breeder> findAllBreeders() {
        return breederService.findAllBreeders();
    }

    @GetMapping("/{id}")
    public Optional<Breeder> findBovinById(@PathVariable("id") Long id) {
        return breederService.findById(id);
    }

    @PostMapping
    public Breeder saveBreeder(@RequestBody Breeder breeder) {
        return breederService.savebreeder(breeder);
    }

    @PutMapping
    public Breeder updateBreeder(@RequestBody Breeder breeder)  {
         return breederService.updateBreeder(breeder);
    }

    @DeleteMapping("/{id}")
    public void deleteBreeder(@PathVariable("id") Long id) {
        breederService.deleteBreeder(id);
    }
}
