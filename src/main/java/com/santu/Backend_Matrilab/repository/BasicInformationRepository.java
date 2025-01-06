package com.santu.Backend_Matrilab.repository;


import com.santu.Backend_Matrilab.entities.BasicInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long> {
}