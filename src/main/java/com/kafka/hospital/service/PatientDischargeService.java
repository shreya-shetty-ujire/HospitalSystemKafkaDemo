package com.kafka.hospital.service;

import com.kafka.hospital.dto.PatientDischargeRequest;
import com.kafka.hospital.event.PatientDischargedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class PatientDischargeService {

    private final ApplicationEventPublisher eventPublisher;

    public PatientDischargeService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void dischargePatient(PatientDischargeRequest request) {
        PatientDischargedEvent event = new PatientDischargedEvent(this, request.getPatientId(), request.getPatientName(), request.getReason());
        eventPublisher.publishEvent(event);
    }
}
