package com.santu.Backend_Matrilab.repository;



import com.santu.Backend_Matrilab.entities.EducationInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationInformationRepository extends JpaRepository<EducationInformation, Long> {
    List<EducationInformation> findByUserId(Long userId);
}