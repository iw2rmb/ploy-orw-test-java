package com.example;

// These imports are ACTUALLY unused and should be removed by OpenRewrite
import java.util.Date;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Hashtable;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.net.URL;
import java.net.Socket;

// These imports ARE used in the code
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    // Using StringBuffer instead of StringBuilder (should be modernized)
    private StringBuffer buffer = new StringBuffer();
    
    // Old-style type declaration (missing diamond operator) - USES ArrayList and List
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
        
        // Old-style collection initialization - USES HashMap and Map
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