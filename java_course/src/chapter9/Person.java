package chapter9;

/*
Chapter 9d Access Limitations & Multiple Inheritances Example
This class demonstrates that inheritance can pass through multiple
layers of objects in a chain by allowing both the Woman and Mother
classes to inherit from this Person class.
 */
public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
    }

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
