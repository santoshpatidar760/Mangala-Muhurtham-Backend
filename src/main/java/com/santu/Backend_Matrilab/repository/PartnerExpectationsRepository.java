package com.santu.Backend_Matrilab.repository;

import com.santu.Backend_Matrilab.entities.PartnerExpectations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerExpectationsRepository extends JpaRepository<PartnerExpectations, Long> {
}

