package com.agric.agricbizerte.controller;
import com.agric.agricbizerte.entity.Bovin;
import com.agric.agricbizerte.service.BovinService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin( maxAge = 3600)
@RestController
@RequestMapping("/bovins")
public class BovinsController {
    private final BovinService bovinService;

    public BovinsController(BovinService bovinService) {
        this.bovinService = bovinService;
    }

    @GetMapping
    public List<Bovin> findAllBovins(@RequestParam(value="search",required = false)  String search) {
        return bovinService.findAllBovins(search);
    }

    @GetMapping("/{id}")
    public Optional<Bovin> findBovinById(@PathVariable("id") Long id) {
        return bovinService.findById(id);
    }

    @PostMapping
    public Bovin saveBovin(@RequestBody Bovin bovin) {
        return bovinService.saveBovin(bovin);
    }

    @PutMapping
    public Bovin updateBovin(@RequestBody Bovin bovin)  {
        return bovinService.saveBovin(bovin);
    }

    @DeleteMapping("/{id}")
    public void deleteBovin(@PathVariable("id") Long id) {
        bovinService.deleteBovin(id);
    }
}
