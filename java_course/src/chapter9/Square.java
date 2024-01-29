package chapter9;

/*
Method Overloading & Overriding Example
This is a child class that inherits from the Rectangle class,
with an overloaded method and overridden method.
 */
public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print(String what) {
        System.out.println("I am a " +what);
    }

}
