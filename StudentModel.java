import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

//mysql
public class StudentModel {
    private static final String STUDENTS_FILE_NAME = "students.csv";
    private static final String QUERIES_FILE_NAME = "queries.csv";
    private static final String[] JOB_TITLES = {"Software Engineer", "Data Analyst", "Product Manager", "UX Designer", "Marketing Manager"};
    private static final String[] LOCATIONS = {"Bangalore", "Hyderabad", "Mumbai", "Delhi", "Chennai"};
    private static final String[] JOB_DESCRIPTIONS = {"Develop and maintain high-quality software products", "Analyze and interpret data to identify trends and patterns", "Lead cross-functional teams to launch new products", "Design and test user interfaces for web and mobile applications", "Develop and execute marketing campaigns to drive customer acquisition and retention"};

    public static void registerForPlacement(String name, String srn, String gpa, String jobId, String emailId, String phoneNumber) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(STUDENTS_FILE_NAME, true));
            writer.write(name + "," + srn + "," + gpa + "," + jobId + "," + emailId + "," + phoneNumber + "\n");
            writer.close();
            System.out.println("Registration successful.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void raiseQuery(String name, String srn, String query) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(QUERIES_FILE_NAME, true));
            writer.write(name + "," + srn + "," + query + "\n");
            writer.close();
            System.out.println("We will get back to you at the earliest! Thank you.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
    /** 
    public static void viewJobDescription() {
        Random random = new Random();
        List<String> jobTitles = new ArrayList<>();
        List<String> locations = new ArrayList<>();
        List<String> jobDescriptions = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(JOB_TITLES.length);
            jobTitles.add(JOB_TITLES[index]);
            locations.add(LOCATIONS[index]);
            jobDescriptions.add(JOB_DESCRIPTIONS[index]);
        }
        System.out.println("Job titles:");
        for (String jobTitle : jobTitles) {
            System.out.println(jobTitle);
        }
        System.out.println("Locations:");
        for (String location : locations) {
            System.out.println(location);
        }
        System.out.println("Job descriptions:");
        for (String jobDescription : jobDescriptions) {
            System.out.println(jobDescription);
        }
    }
    **/
    
    public static void viewJobDescription(){
        String csvFile = "jobs.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] jobs = line.split(cvsSplitBy);
                for (String job : jobs) {
                    System.out.print(job + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    





public static void editProfileName(String srn, String updatedName) {
    try {
        List<String> lines = Files.readAllLines(Paths.get(STUDENTS_FILE_NAME));
        List<String> newLines = new ArrayList<>();
        boolean updated = false;
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts[1].equals(srn)) {
                parts[0] = updatedName;
                line = String.join(",", parts);
                updated = true;
            }
            newLines.add(line);
        }
        if (updated) {
            Files.write(Paths.get(STUDENTS_FILE_NAME), newLines);
            System.out.println("Profile name updated successfully.");
        } else {
            System.out.println("No profile with entered SRN found.");
        }
    } catch (IOException e) {
        System.out.println("Error writing to file.");
    }
}



}

/** 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


//mysql
public class StudentModel {
    private static final String STUDENTS_FILE_NAME = "students.csv";
    private static final String QUERIES_FILE_NAME = "queries.csv";
    private static final String[] JOB_TITLES = {"Software Engineer", "Data Analyst", "Product Manager", "UX Designer", "Marketing Manager"};
    private static final String[] LOCATIONS = {"Bangalore", "Hyderabad", "Mumbai", "Delhi", "Chennai"};
    private static final String[] JOB_DESCRIPTIONS = {"Develop and maintain high-quality software products", "Analyze and interpret data to identify trends and patterns", "Lead cross-functional teams to launch new products", "Design and test user interfaces for web and mobile applications", "Develop and execute marketing campaigns to drive customer acquisition and retention"};

    public static void registerForPlacement(String name, String srn, String gpa, String jobId, String emailId, String phoneNumber) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            BufferedWriter writer = new BufferedWriter(new FileWriter(STUDENTS_FILE_NAME, true));
            writer.write(name + "," + srn + "," + gpa + "," + jobId + "," + emailId + "," + phoneNumber + "\n");
            writer.close();
            System.out.println("Registration successful.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void raiseQuery(String name, String srn, String query) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(QUERIES_FILE_NAME, true));
            writer.write(name + "," + srn + "," + query + "\n");
            writer.close();
            System.out.println("We will get back to you at the earliest! Thank you.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void viewJobDescription() {
        Random random = new Random();
        List<String> jobTitles = new ArrayList<>();
        List<String> locations = new ArrayList<>();
        List<String> jobDescriptions = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(JOB_TITLES.length);
            jobTitles.add(JOB_TITLES[index]);
            locations.add(LOCATIONS[index]);
            jobDescriptions.add(JOB_DESCRIPTIONS[index]);
        }
        System.out.println("Job titles:");
        for (String jobTitle : jobTitles) {
            System.out.println(jobTitle);
        }
        System.out.println("Locations:");
        for (String location : locations) {
            System.out.println(location);
        }
        System.out.println("Job descriptions:");
        for (String jobDescription : jobDescriptions) {
            System.out.println(jobDescription);
        }
    }



public static void editProfileName(String srn, String updatedName) {
    try {
        List<String> lines = Files.readAllLines(Paths.get(STUDENTS_FILE_NAME));
        List<String> newLines = new ArrayList<>();
        boolean updated = false;
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts[1].equals(srn)) {
                parts[0] = updatedName;
                line = String.join(",", parts);
                updated = true;
            }
            newLines.add(line);
        }
        if (updated) {
            Files.write(Paths.get(STUDENTS_FILE_NAME), newLines);
            System.out.println("Profile name updated successfully.");
        } else {
            System.out.println("No profile with entered SRN found.");
        }
    } catch (IOException e) {
        System.out.println("Error writing to file.");
    }
}



}
**/