package com.santu.Backend_Matrilab.service.impl;

import com.santu.Backend_Matrilab.dto.request.PartnerExpectationsDTO;
import com.santu.Backend_Matrilab.dto.response.PartnerExpectationsResponse;
import com.santu.Backend_Matrilab.entities.PartnerExpectations;
import com.santu.Backend_Matrilab.entities.User;
import com.santu.Backend_Matrilab.repository.PartnerExpectationsRepository;
import com.santu.Backend_Matrilab.repository.UserRepository;
import com.santu.Backend_Matrilab.service.interfac.PartnerExpectationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartnerExpectationsServiceImpl implements PartnerExpectationsService {

    @Autowired
    private PartnerExpectationsRepository partnerExpectationsRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public PartnerExpectationsResponse savePartnerExpectations(PartnerExpectationsDTO requestDTO) {
        Long userId = requestDTO.getUserId();
        if (userId == null) {
            throw new RuntimeException("User ID is required to save partner expectations.");
        }

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

        PartnerExpectations partnerExpectations = mapDTOToEntity(requestDTO, new PartnerExpectations());
        partnerExpectations.setUser(user);
        PartnerExpectations savedEntity = partnerExpectationsRepository.save(partnerExpectations);

        return mapEntityToResponse(savedEntity);
    }

    @Override
    public List<PartnerExpectationsResponse> getAllPartnerExpectations() {
        return partnerExpectationsRepository.findAll().stream()
                .map(this::mapEntityToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public PartnerExpectationsResponse updatePartnerExpectations(Long id, PartnerExpectationsDTO requestDTO) {
        PartnerExpectations partnerExpectations = partnerExpectationsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PartnerExpectations not found with ID: " + id));

        mapDTOToEntity(requestDTO, partnerExpectations);
        PartnerExpectations updatedEntity = partnerExpectationsRepository.save(partnerExpectations);

        return mapEntityToResponse(updatedEntity);
    }

    @Override
    public PartnerExpectationsResponse getPartnerExpectationsById(Long id) {
        PartnerExpectations partnerExpectations = partnerExpectationsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PartnerExpectations not found with ID: " + id));

        return mapEntityToResponse(partnerExpectations);
    }

    // Helper methods for mapping
    private PartnerExpectations mapDTOToEntity(PartnerExpectationsDTO dto, PartnerExpectations entity) {
        entity.setGeneralRequirement(dto.getGeneralRequirement());
        entity.setMinimumAge(dto.getMinimumAge());
        entity.setMaximumAge(dto.getMaximumAge());
        entity.setMinimumHeight(dto.getMinimumHeight());
        entity.setMaximumHeight(dto.getMaximumHeight());
        entity.setMaximumWeight(dto.getMaximumWeight());
        entity.setMaritalStatus(dto.getMaritalStatus());
        entity.setReligion(dto.getReligion());
        entity.setComplexion(dto.getComplexion());
        entity.setSmokingHabits(dto.getSmokingHabits());
        entity.setDrinkingStatus(dto.getDrinkingStatus());
        entity.setMinimumDegree(dto.getMinimumDegree());
        entity.setProfession(dto.getProfession());
        entity.setLanguages(dto.getLanguages());
        entity.setPersonality(dto.getPersonality());
        entity.setFinancialCondition(dto.getFinancialCondition());
        entity.setFamilyPosition(dto.getFamilyPosition());
        return entity;
    }

    private PartnerExpectationsResponse mapEntityToResponse(PartnerExpectations entity) {
        Long userId = entity.getUser() != null ? entity.getUser().getId() : null;
        return new PartnerExpectationsResponse(
                entity.getId(),
                userId,
                entity.getGeneralRequirement(),
                entity.getMinimumAge(),
                entity.getMaximumAge(),
                entity.getMinimumHeight(),
                entity.getMaximumHeight(),
                entity.getMaximumWeight(),
                entity.getMaritalStatus(),
                entity.getReligion(),
                entity.getComplexion(),
                entity.getSmokingHabits(),
                entity.getDrinkingStatus(),
                entity.getMinimumDegree(),
                entity.getProfession(),
                entity.getLanguages(),
                entity.getPersonality(),
                entity.getFinancialCondition(),
                entity.getFamilyPosition()
        );
    }
}


