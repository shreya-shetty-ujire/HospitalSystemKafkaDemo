package com.kafka.hospital.service;

import com.kafka.hospital.event.PatientDischargedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService {

    @EventListener
    @Async
    public void handleDischargeEvent(PatientDischargedEvent event) {
        System.out.println("PharmacyService: Closing prescriptions for patient " + event.getName()+ " : "+Thread.currentThread().getName());

    }
}
