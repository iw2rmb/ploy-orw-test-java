package com.example;

import java.util.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import javax.swing.*;

public class DataProcessor {
    // Using Vector (legacy collection)
    private Vector<String> data = new Vector<String>();
    
    // Using Hashtable (legacy)
    private Hashtable<String, Object> cache = new Hashtable<String, Object>();
    
    public void processData() {
        // Using Enumeration (legacy)
        Enumeration<String> enumeration = data.elements();
        while (enumeration.hasMoreElements()) {
            String item = enumeration.nextElement();
            processItem(item);
        }
        
        // Unnecessary boxing
        Integer number = new Integer(42);
        Double decimal = new Double(3.14);
        
        // String comparison using == instead of equals
        String str1 = "test";
        String str2 = "test";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        }
    }
    
    private void processItem(String item) {
        // Inefficient string replace
        String processed = item.replaceAll("\\.", "_");
        System.out.println(processed);
    }
    
    // Method that could use try-with-resources
    public void readFile(String filename) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}