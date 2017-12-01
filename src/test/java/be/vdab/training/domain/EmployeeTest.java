package be.vdab.training.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private static final Logger LOGGER = LogManager.getLogger(EmployeeTest.class);

    @Test
    public void testEmployeeConstructor() {
        BaseEntity.resetCounter();

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        assertEquals("id should be 1", 1, employee1.getId());
        assertEquals("id should be 2", 2, employee2.getId());
    }

    @Test
    public void testEmployeeFirstName() {
        Employee employee = new Employee();
        employee.setFirstName("Jimmy");
        assertEquals("getters and setters of first-name", "Jimmy", employee.getFirstName());
    }

    @Test
    public void testEmployeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jimmy");
        employee.setMiddleName("Marcel");
        employee.setLastName("Bryssinck");
//        employee.getFullName();
        assertEquals("complete name", "Jimmy Marcel Bryssinck", employee.getFullName());
    }

}
