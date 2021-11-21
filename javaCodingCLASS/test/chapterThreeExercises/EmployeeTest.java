package chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    Employee employee;
    Employee employee2;

    @BeforeEach
    void setUp() {
        employee = new Employee("Ade", "Olabode", 2800.00);
        employee2 = new Employee("Ede", "labode", 2900.00);


    }

    @Test
    void thatFirstNameCanBeCreated() {
        employee.getFirstName();
        assertEquals("Ade", employee.getFirstName());
        employee.setFirstName("tunde");
        assertEquals("tunde", employee.getFirstName());


    }

    @Test
    void thatLasttNameCanBeCreated() {
        employee.getLastName();
        assertEquals("Olabode", employee.getLastName());
        employee.setLastName("tunde");
        assertEquals("tunde", employee.getLastName());


    }

    @Test
    void salary() {
        employee.getSalary();
        assertEquals(2800.00, employee.getSalary());
        employee.setSalary(2345.54);
        assertEquals(2345.54, employee.getSalary());
        employee.dispylayEmployee();
        employee2.dispylayEmployee();
        employee2.percentageSalaryIncrease();
        employee.percentageSalaryIncrease();
    }
}