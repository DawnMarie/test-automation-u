package chapter12;

import java.util.*;

/*
Chapter 12b Looping through Collections and Maps Example
This class demonstrates differences in behavior when creating different
types of Collections and then how to loop through them.
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    private static void addFruit(Collection<String> collection) {
        collection.add("apple");
        collection.add("lemon");
        collection.add("banana");
        collection.add("orange");
        collection.add("lemon");
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        addFruit(fruit);

        System.out.println(fruit.size());
        System.out.println(fruit);

        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item : fruit) {
            System.out.println(item);
        }

        fruit.forEach(System.out::println);

        System.out.println("-------");
    }

    public static void listDemo() {
        List<String> fruit = new ArrayList();
        addFruit(fruit);

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);

        System.out.println("-------");
    }

    public static void queueDemo() {
        Queue<String> fruit = new LinkedList();
        addFruit(fruit);

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);

        System.out.println(fruit.peek());

        System.out.println("-------");
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);

        for (var entry : fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v));

        System.out.println("-------");
    }

}
