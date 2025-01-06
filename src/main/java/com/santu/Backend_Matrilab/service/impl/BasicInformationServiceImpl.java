package com.santu.Backend_Matrilab.service.impl;
import com.santu.Backend_Matrilab.dto.request.BasicInformationDTO;
import com.santu.Backend_Matrilab.dto.response.BasicInformationResponse;
import com.santu.Backend_Matrilab.entities.BasicInformation;
import com.santu.Backend_Matrilab.entities.User;
import com.santu.Backend_Matrilab.repository.BasicInformationRepository;
import com.santu.Backend_Matrilab.repository.UserRepository;
import com.santu.Backend_Matrilab.service.interfac.BasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BasicInformationServiceImpl implements BasicInformationService {

    @Autowired
    private BasicInformationRepository basicInformationRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public BasicInformationResponse saveBasicInformation(BasicInformationDTO requestDTO) {
        // Extract userId from the DTO
        Long userId = requestDTO.getUserId();
        if (userId == null) {
            throw new RuntimeException("User ID is required to save basic information.");
        }

        // Find the user by ID
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

        // Map DTO to entity
        BasicInformation basicInformation = mapDTOToEntity(requestDTO, new BasicInformation());
        basicInformation.setUser(user);

        // Save the entity
        BasicInformation savedEntity = basicInformationRepository.save(basicInformation);

        // Return response
        return mapEntityToResponse(savedEntity);
    }

    @Override
    public List<BasicInformationResponse> getAllBasicInformation() {
        return basicInformationRepository.findAll().stream()
                .map(this::mapEntityToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public BasicInformationResponse updateBasicInformation(Long id, BasicInformationDTO requestDTO) {
        // Fetch the existing BasicInformation by ID
        BasicInformation basicInformation = basicInformationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Basic Information not found with ID: " + id));

        // Map DTO to entity and update it
        mapDTOToEntity(requestDTO, basicInformation);
        BasicInformation updatedEntity = basicInformationRepository.save(basicInformation);

        // Return response
        return mapEntityToResponse(updatedEntity);
    }

    @Override
    public BasicInformationResponse getBasicInformationById(Long id) {
        // Fetch the BasicInformation by ID
        BasicInformation basicInformation = basicInformationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Basic Information not found with ID: " + id));

        // Return response
        return mapEntityToResponse(basicInformation);
    }



    // Helper methods for mapping DTO to entity
    private BasicInformation mapDTOToEntity(BasicInformationDTO dto, BasicInformation entity) {
        // Ensure that fields that should be Long or Integer are correctly mapped
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setDateOfBirth(dto.getDateOfBirth());
        entity.setReligion(dto.getReligion());
        entity.setGender(dto.getGender());
        entity.setMaritalStatus(dto.getMaritalStatus());
        entity.setLanguage(dto.getLanguage());
        entity.setProfession(dto.getProfession());
        entity.setPresentAddress(dto.getPresentAddress());
        entity.setFinancialCondition(dto.getFinancialCondition());
        entity.setSmokingHabits(dto.getSmokingHabits());
        entity.setDrinkingStatus(dto.getDrinkingStatus());
        entity.setDistrict(dto.getDistrict());
        entity.setDivision(dto.getDivision());
        entity.setTaluk(dto.getTaluk());
        entity.setZipCode(dto.getZipCode());

        return entity;
    }

    // Helper method for mapping entity to response
    private BasicInformationResponse mapEntityToResponse(BasicInformation entity) {
        return new BasicInformationResponse(
                entity.getId(),
                entity.getUser().getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getDateOfBirth(),
                entity.getReligion(),
                entity.getGender(),
                entity.getMaritalStatus(),
                entity.getLanguage(),
                entity.getProfession(),
                entity.getPresentAddress(),
                entity.getFinancialCondition(),
                entity.getSmokingHabits(),
                entity.getDrinkingStatus(),
                entity.getDistrict(),
                entity.getDivision(),
                entity.getTaluk(),
                entity.getZipCode()
        );
    }
}
