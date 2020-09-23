package com.company;

public class Patient {
    private String name;
    private String diagnosis; // Null means sick

    public Patient(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public Patient(String name) {
        this.name = name;
        this.diagnosis = null;
    }

    public boolean isSick() {
        return (diagnosis != null);
    }

    public String getSickness() {
        return diagnosis;
    }

    public String getName() {
        return name;
    }

    public void takeMedication(Medicine medicine) {
        if (medicine.getTreatmentName() == getSickness()) {
            diagnosis = null;
        }
    }
}

