package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code")); // null because it is new one.
        System.out.println(languages.put("Lisp", "Therein lies madness")); // null because it is new one.
        // if put new value in exist value then it will be overwritten

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("================================================");

        // languages.remove("Lisp");


        for (String key : languages.keySet()) { // Soon we'll discuss what .keySet() is in Set lectures.
            System.out.println(key + " : " + languages.get(key));
        }
    }
}