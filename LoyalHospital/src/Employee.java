/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author HP840 G5
 */
public interface Employee {
    void performDuties();
    
    
}

 class Doctor implements Employee {
    @Override
    public void performDuties() {
        System.out.println("Doctor is treating patients.");
    }
}

 class Nurse implements Employee {
    @Override
    public void performDuties() {
        System.out.println("Nurse is taking care of patients.");
    }
}

