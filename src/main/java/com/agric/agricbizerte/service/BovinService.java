package com.agric.agricbizerte.service;
import com.agric.agricbizerte.entity.Bovin;
import com.agric.agricbizerte.repository.IBovinRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class BovinService  implements IBovinService {
    private final IBovinRepository bovinRepository;

    public BovinService(IBovinRepository bovinRepository) {
        this.bovinRepository = bovinRepository;
    }

    @Override
    public List<Bovin> findAllBovins(String search) {
        Predicate<Bovin> byAllItem=bovin -> true;
        if(search != null){
            byAllItem = bovin -> bovin.getBovinId().toLowerCase().contains(search.toLowerCase())|| bovin.getDestination().toLowerCase().contains(search.toLowerCase()) || bovin.getTypeRacial().toLowerCase().contains(search.toLowerCase()) || bovin.getLocation().toLowerCase().contains(search.toLowerCase()) || bovin.getSupplier().getName().toLowerCase().contains(search.toLowerCase());
        }

        return bovinRepository.findAll().stream().filter(byAllItem).toList();
    }

    @Override
    public Optional<Bovin> findById(Long id) {
        return bovinRepository.findById(id);
    }
    @Query("select b from Bovins b where b.bovin_id = :id")
    @Override
    public Optional<Bovin> findBybovinId(String id) {
        return bovinRepository.getByBovinId(id);
    }

    @Override
    public Bovin saveBovin(Bovin bovin) {
        return  bovinRepository.save(bovin);
    }

    @Override
    public Bovin updateBovin(Bovin bovin) {
        return  bovinRepository.save(bovin);
    }

    @Override
    public void deleteBovin(Long id) {
        bovinRepository.deleteById(id);
    }
}
