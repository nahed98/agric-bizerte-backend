package com.agric.agricbizerte.service;

import com.agric.agricbizerte.entity.Bovin;

import java.util.List;
import java.util.Optional;

public interface IBovinService {
    List<Bovin> findAllBovins(String search);
    Optional<Bovin> findById(Long id);
    Optional<Bovin> findBybovinId(String id);
    Bovin saveBovin(Bovin bovin);
    Bovin updateBovin(Bovin bovin);
    void deleteBovin(Long id);

}
