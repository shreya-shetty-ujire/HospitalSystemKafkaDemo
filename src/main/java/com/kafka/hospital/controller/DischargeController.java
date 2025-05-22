package com.kafka.hospital.controller;

import com.kafka.hospital.dto.PatientDischargeRequest;

import com.kafka.hospital.service.PatientDischargeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discharge")
public class DischargeController {

    private final PatientDischargeService dischargeService;

    public DischargeController(PatientDischargeService dischargeService) {
        this.dischargeService = dischargeService;
    }

    @PostMapping("/process")
    public String dischargePatient(@RequestBody PatientDischargeRequest request) {
        dischargeService.dischargePatient(request);
        return "Discharge process started for " + request.getPatientName();
    }


}
