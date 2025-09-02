package com.example;

// Unused imports that should be removed
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.io.IOException;
import java.io.File;

public class Application {
    // Using StringBuffer instead of StringBuilder (should be modernized)
    private StringBuffer buffer = new StringBuffer();
    
    // Old-style type declaration (missing diamond operator)
    private List<String> items = new ArrayList<String>();
    
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
    
    public void run() {
        // Using StringBuffer (should use StringBuilder)
        StringBuffer message = new StringBuffer();
        message.append("Hello");
        message.append(" ");
        message.append("World");
        System.out.println(message.toString());
        
        // Old-style collection initialization
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        
        // Inefficient string concatenation in loop
        String result = "";
        for (int i = 0; i < 10; i++) {
            result = result + i + ", ";
        }
        System.out.println(result);
    }
    
    // Unused private method (should be removed)
    private void unusedMethod() {
        System.out.println("This method is never called");
    }
}