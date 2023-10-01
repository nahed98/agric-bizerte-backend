package com.agric.agricbizerte.repository;

import com.agric.agricbizerte.entity.Bovin;
import com.agric.agricbizerte.entity.Breeder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBreederRepository extends JpaRepository<Breeder, Long> {
}
