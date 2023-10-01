package com.agric.agricbizerte.service;

import com.agric.agricbizerte.entity.Breeder;
import com.agric.agricbizerte.repository.IBreederRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BreederService implements IBreederService {
    private final IBreederRepository breederRepository;

    public BreederService(IBreederRepository breederRepository) {
        this.breederRepository = breederRepository;
    }

    @Override
    public List<Breeder> findAllBreeders() {
        return breederRepository.findAll();
    }

    @Override
    public Optional<Breeder> findById(Long id) {
        return breederRepository.findById(id);
    }

    @Override
    public Breeder savebreeder(Breeder breeder) {
        return breederRepository.save(breeder);
    }

    @Override
    public Breeder updateBreeder(Breeder breeder) {
        return breederRepository.save(breeder);
    }

    @Override
    public void deleteBreeder(Long id) {
        breederRepository.deleteById(id);
    }
}
