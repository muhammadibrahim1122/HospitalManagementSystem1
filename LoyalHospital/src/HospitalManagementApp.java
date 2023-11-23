/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP840 G5
 */
public class HospitalManagementApp {
     public static void main(String[] args) {
        PatientRegistration patientRegistration = new PatientRegistration();

        try {
            patientRegistration.registerPatient("John Doe", 25);
            patientRegistration.registerPatient("ibrahim ", 30); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.err.println("Error registering patient: " + e.getMessage());
            // Log the exception or perform additional error-handling actions
        }
    }
    
}
