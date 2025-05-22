package com.kafka.hospital.event;

import org.springframework.context.ApplicationEvent;

public class PatientDischargedEvent extends ApplicationEvent {

    private final String patientId;
    private final String name;
    private final String reason;

    public PatientDischargedEvent(Object source, String patientId, String name, String reason) {
        super(source);
        this.patientId = patientId;
        this.name = name;
        this.reason = reason;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "PatientDischargedEvent{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
