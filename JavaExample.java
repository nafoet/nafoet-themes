package winter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using streams and lambda expressions
        List<String> upperCaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Upper case fruits: " + upperCaseFruits);

        // Using optional to avoid null checks
        String longestFruit = fruits.stream()
                .max((a, b) -> a.length() - b.length())
                .orElse("No fruits found");

        System.out.println("Longest fruit: " + longestFruit);
    }
}

// Generic class example
class Box<T> {
    private T content;

    public void put(T item) {
        this.content = item;
    }

    public T get() {
        return content;
    }
}