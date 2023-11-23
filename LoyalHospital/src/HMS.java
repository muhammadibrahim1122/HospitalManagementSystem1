/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP840 G5
 */
public class HMS {
    
   
    public static void main(String[] args) {
        // Create a Doctor using the DoctorFactory
        EmployeeFactory doctorFactory = new DoctorFactory();
        Employee doctor = doctorFactory.createEmployee();
        doctor.performDuties();

        // Create a Nurse using the NurseFactory
        EmployeeFactory nurseFactory = new NurseFactory();
        Employee nurse = nurseFactory.createEmployee();
        nurse.performDuties();
    }
}

