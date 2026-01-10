package org.example.Group37.homework.lesson8.task1;

public class Clinic {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient = new Patient(1);

        therapist.appointDoctor(patient);
        patient.getDoctor().patientTreatment();
    }

}
