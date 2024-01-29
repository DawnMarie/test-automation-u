package chapter9;

/*
Chapter 9a Inheritance Example
This class demonstrates that the Person class can serve as a base class.
 */
public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name) {
        System.out.println("In Person the name is now set.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}