package com.kafka.hospital.dto;

public class PatientDischargeRequest {
        private String patientId;
        private String patientName;
        private String reason;

        public String getPatientId() { return patientId; }
        public void setPatientId(String patientId) { this.patientId = patientId; }
        public String getPatientName() { return patientName; }
        public void setPatientName(String patientName) { this.patientName = patientName; }
        public String getReason() { return reason; }
        public void setReason(String reason) { this.reason = reason; }
    }