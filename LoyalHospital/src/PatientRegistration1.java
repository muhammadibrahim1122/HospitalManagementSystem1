/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP840 G5
 */
public class PatientRegistration1 {
    
     public static void main(String[] args) {
        try {
            registerPatient(" ", " ", " ");
            System.out.println("Patient registered successfully.");
        } catch (InvalidPatientDataException e) {
            System.out.println("Error registering patient: " + e.getMessage());
        }
    }

    private static void registerPatient(String name, String address, String phoneNumber) throws InvalidPatientDataException {
        if (name.isEmpty() || address.isEmpty() || phoneNumber.isEmpty()) {
            throw new InvalidPatientDataException("All patient details must be provided.");
        }

        // Perform actual patient registration logic here
        // ...

        System.out.println("Patient registration complete.");
    }
}

class InvalidPatientDataException extends Exception {

    public InvalidPatientDataException(String message) {
        super(message);
    }
}
