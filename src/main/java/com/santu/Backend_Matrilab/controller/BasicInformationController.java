package com.santu.Backend_Matrilab.controller;

import com.santu.Backend_Matrilab.dto.request.BasicInformationDTO;
import com.santu.Backend_Matrilab.dto.response.BasicInformationResponse;
import com.santu.Backend_Matrilab.service.interfac.BasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RestController
@RequestMapping("/api/basic-information")
 // Replace with your React app's URL
public class BasicInformationController {

    @Autowired
    private BasicInformationService basicInformationService;

    // Save Basic Information
    @PostMapping
    public BasicInformationResponse saveBasicInformation(@RequestBody BasicInformationDTO requestDTO) {
        return basicInformationService.saveBasicInformation(requestDTO);
    }

    // Get All Basic Information
    @GetMapping
    public List<BasicInformationResponse> getAllBasicInformation() {
        return basicInformationService.getAllBasicInformation();
    }

    // Get Basic Information by ID
    @GetMapping("/{id}")
    public BasicInformationResponse getBasicInformationById(@PathVariable Long id) {
        return basicInformationService.getBasicInformationById(id);
    }

    // Update Basic Information
    @PutMapping("/{id}")
    public BasicInformationResponse updateBasicInformation(
            @PathVariable Long id,
            @RequestBody BasicInformationDTO requestDTO) {
        return basicInformationService.updateBasicInformation(id, requestDTO);
    }
}
