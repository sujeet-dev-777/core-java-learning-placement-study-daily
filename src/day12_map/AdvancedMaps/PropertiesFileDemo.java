package day12_map.AdvancedMaps;

import java.util.Map;
import java.util.Properties;

public class PropertiesFileDemo {

    public static void main(String[] args) {

        // Create Properties object
        Properties properties = new Properties();

        // Store application settings
        properties.setProperty("applicationName", "Library Management System");
        properties.setProperty("version", "1.0");
        properties.setProperty("language", "Java");
        properties.setProperty("database", "MySQL");
        properties.setProperty("environment", "Development");

        // Display complete Properties object
        System.out.println("Application Settings:");
        System.out.println(properties);

        // Display properties one by one
        System.out.println("Individual Settings:");

        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Get a specific property
        System.out.println("=================================================");
        System.out.println("Application Name: " + properties.getProperty("applicationName"));

        System.out.println("Version: " + properties.getProperty("version"));
    }
}