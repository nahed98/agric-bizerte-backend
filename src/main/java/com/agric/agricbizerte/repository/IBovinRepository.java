package com.agric.agricbizerte.repository;

import com.agric.agricbizerte.entity.Bovin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBovinRepository extends JpaRepository<Bovin, Long> {
    Optional<Bovin> getByBovinId(String id);
}