package _10CollectionsInJava;


import java.util.Objects;

public class Employee {
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        if (this.employeeId == employee.employeeId) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this);
    }
}
