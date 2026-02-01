package myBasic.c06_bucles;

import java.util.HashMap;
import java.util.HashSet;

public class Loops {
    static void main(String[] args) {

        // For
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] names = {"Greg", "John", "Jannet"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // ForEach
        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = {1,2,3,4,5};

        for (int number : numbers) {
            System.out.println(number);
        }

        HashSet<String> colors = new HashSet<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");

        for (String color : colors) {
            System.out.println(color);
        }

        HashMap<String, Integer> people = new HashMap<>();

        people.put("Gregory", 26);
        people.put("Raul", 28);
        people.put("Rosa", 49);
        people.put("Anna", 34);

        for (String key : people.keySet()) {
            System.out.printf("%s tiene %d años de edad.%n", key, people.get(key));
        }

        // While
        int counter = 0;

        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }

        // Do-While
        int counter2 = 0;

        do {
            System.out.println(counter2);
            counter2++;
        } while (counter2 < 5);
    }
}
