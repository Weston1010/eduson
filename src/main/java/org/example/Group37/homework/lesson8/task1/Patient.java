package org.example.Group37.homework.lesson8.task1;

public class Patient {

    private int treatmentPlan;
    private Treat doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Treat getDoctor() {
        return doctor;
    }

    public void setDoctor(Treat doctor) {
        this.doctor = doctor;
    }
}
