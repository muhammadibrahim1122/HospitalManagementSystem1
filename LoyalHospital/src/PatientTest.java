/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP840 G5
 */

 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 
public class PatientTest {
    
    @Test
    public void testPatientGetName() {
        Patient patient = new Patient("John Doe", 25);
        assertEquals("John Doe", patient.getName(), "getName should return the correct name");
    }
    
      @Test
    public void testPatientGetAge() {
        Patient patient = new Patient("Jane Doe", 30);
        assertEquals(30, patient.getAge(), "getAge should return the correct age");
    }

}
 