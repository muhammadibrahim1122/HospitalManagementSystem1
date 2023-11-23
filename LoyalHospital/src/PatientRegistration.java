/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP840 G5
 */
public class PatientRegistration {
    
    
     public void registerPatient(String name, int age) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }

        // Perform the actual registration logic here

        System.out.println("Patient registered successfully: " + name + ", Age: " + age);
    }
     
}
