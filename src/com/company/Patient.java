package com.company;

class Patient {
    private String name;
    private String diagnosis; // Null means the patient is healthy

    Patient(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }

    Patient(String name) {
        this.name = name;
        this.diagnosis = null;
    }

    boolean isSick() {
        return (diagnosis != null);
    }

    String getSickness() {
        return diagnosis;
    }

    String getName() {
        return name;
    }

    void takeMedication(Medicine medicine) {
        if (medicine.getTreatmentName().equals(getSickness())) {
            diagnosis = null;
        }
    }
}

