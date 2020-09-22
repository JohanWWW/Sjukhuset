package com.company;

public class Patient {
    private String name;
    private String diagnosis;
    private boolean isSick;

    public Patient(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;

        // null means healthy
        if (diagnosis == null) {
            isSick = false;
        } else {
            isSick = true;
        }
    }

    public Patient(String name) {
        this.name = name;
        this.diagnosis = null;
    }

    public boolean isSick() {
        return isSick;
    }

    public String getSickness() {
        return diagnosis;
    }

    public String getName() {
        return name;
    }

    public void takeMedication(Medicine medicine) {

    }
}

