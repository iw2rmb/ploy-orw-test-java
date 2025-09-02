package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Java 8 style code
        List<String> items = new ArrayList<String>();
        items.add("Hello");
        items.add("World");
        
        // This should be converted to var in Java 11
        String message = "Java 8 code";
        System.out.println(message);
        
        // Diamond operator could be simplified
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
    }
}