/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author HP840 G5
 */
public interface EmployeeFactory {
     Employee createEmployee();
}

 class DoctorFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Doctor();
    }
}

 class NurseFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Nurse();
    }
}


