package com.agric.agricbizerte.service;

import com.agric.agricbizerte.entity.Breeder;

import java.util.List;
import java.util.Optional;

public interface IBreederService {
    List<Breeder> findAllBreeders();
    Optional<Breeder> findById(Long id);
    Breeder savebreeder(Breeder breeder);
    Breeder updateBreeder(Breeder breeder);
    void deleteBreeder(Long id);
}
