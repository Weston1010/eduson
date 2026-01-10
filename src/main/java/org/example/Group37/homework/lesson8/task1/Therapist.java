package org.example.Group37.homework.lesson8.task1;

public class Therapist implements Treat {

    @Override
    public void patientTreatment() {
        System.out.println("Лечит терапевт");
    }

    public void appointDoctor(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1:
                patient.setDoctor(new Surgeon());
                break;
            case 2:
                patient.setDoctor(new Dentist());
                break;
            default:
                patient.setDoctor(new Therapist());
        }
    }
}