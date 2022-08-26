package com.cfs.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cfs.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
