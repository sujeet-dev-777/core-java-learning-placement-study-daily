package day12_map.AdvancedMaps;

import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties applicationProperties = new Properties();

        applicationProperties.setProperty("database", "MySQL");
        applicationProperties.setProperty("username", "admin");
        applicationProperties.setProperty("password", "12345");

        System.out.println("Database : " + applicationProperties.getProperty("database"));

        System.out.println("Username : " + applicationProperties.getProperty("username"));

        System.out.println("Password : " + applicationProperties.getProperty("password"));

        System.out.println("Unknown : " + applicationProperties.getProperty("Unknown"));
    }
}