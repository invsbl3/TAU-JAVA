package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Sets {
    public static void main(String[] args) {
        setDemo();
        System.out.println();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        fruit.add("apple");

        // System.out.println(fruit.size());
        // System.out.println(fruit);

        System.out.println("while loop: ");
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            //    System.out.println(i.hasNext()); // infinite true loop why???
        }

        System.out.println("for loop: ");
        for (String item : fruit) {
            System.out.println(item);
        }

        System.out.println("forEach sentence loop: ");
        fruit.forEach(x -> System.out.println(x));
        System.out.println("forEach sentence loop with Method Reference: ");
        fruit.forEach(System.out::println);
        // even further:
        // import java.System.*;
        // fruit.forEach( out :: println);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17); // overwrite the previous <lemon, 20>


        System.out.println("Map for loop:");
        for (var entry : fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("Map forEach:");

        fruitCalories.forEach((k, v) -> System.out.printf("%-10s%10s%-10s%10d\n", "Fruit: ", k, "   Calories: ", v));
    }
}
