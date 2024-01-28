package chapter9;

/*
Chapter 9a Inheritance Example
This class demonstrates that the Employee class can extend the Person class.
 */
public class Employee extends Person {

    private String employeeId;
    private String title;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
