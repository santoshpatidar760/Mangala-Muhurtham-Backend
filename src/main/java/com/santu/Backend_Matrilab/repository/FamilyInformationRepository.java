package com.santu.Backend_Matrilab.repository;


import com.santu.Backend_Matrilab.entities.FamilyInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyInformationRepository extends JpaRepository<FamilyInformation, Long> {
//    FamilyInformation findByUserId(Long userId);
}