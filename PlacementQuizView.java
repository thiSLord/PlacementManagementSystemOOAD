/**import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class PlacementQuizView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String displayOptions() {
        System.out.println("Please select an option:");
        System.out.println("a. Take Placement Quiz");
        System.out.println("b. About Intuit");
        System.out.println("c. Placement Statistics");
        System.out.println("d. View queries");
        System.out.println("e. Delete students with lower GPA");
        System.out.println("f. Add job");
        System.out.println("g. Exit");
        return scanner.nextLine();
    }

    public static boolean confirmQuiz() {
        System.out.println("Do you want to take the placement quiz now?");
        System.out.println("A. Yes");
        System.out.println("B. No");
        return scanner.next().equals("A");
    }

    public static String[] getAnswers() {
        String[] answers = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Question " + (i + 1) + ": " + PlacementQuiz.getQuestions()[i]);
            System.out.println("A. " + PlacementQuiz.getAnswers()[i]);
            System.out.println("B. " + PlacementQuiz.getAnswers()[i].toLowerCase());
            System.out.println("C. " + PlacementQuiz.getAnswers()[i].toLowerCase() + "!");
            answers[i] = scanner.next().toUpperCase();
        }
        return answers;
    }

    public static void displayScore(int score) {
        System.out.println("Your score is " + score + " out of 3.");
    }

    public static void displayAboutIntuit() {
        System.out.println("Intuit is a financial software company that develops and sells financial,\n" +
                "accounting, and tax preparation software for individuals and small businesses.\n" +
                "The company has a great work culture that values innovation, collaboration,\n" +
                "and customer obsession. We strive to create a work environment that empowers\n" +
                "employees to be their best selves and achieve their full potential.");
        System.out.println("Frequently Asked Questions:");
        System.out.println("Q. What is Intuit's approach to innovation?\n" +
                "A. At Intuit, we believe that innovation can come from anywhere and anyone.\n" +
                "We encourage our employees to think outside the box and experiment with new ideas.\n" +
                "Q. How does Intuit foster collaboration among its employees?\n" +
                "A. We have a strong culture of collaboration at Intuit. Our employees work in small\n" +
                "cross-functional teams that are empowered to make decisions and drive impact. We also have a variety of\n" +
                "collaboration tools and spaces that encourage teamwork and communication.\n" +
                "Q. What is Intuit's customer obsession philosophy?\n" +
                "A. At Intuit, we are committed to putting our customers at the center of everything\n" +
                "we do. We listen to their needs, understand their pain points, and strive to deliver\n" +
                "solutions that help them succeed.");
        System.out.println("If you have any further queries, please reach out to us at HRshitha@intuit.com.");
    }

    public static void displayPlacementStats() {
        System.out.println("Placement Statistics of Intuit for Last 3 Years:");
        System.out.println("Job Title\t\tCandidates Hired\tQualifications\tCandidates Hired from PES University");
        System.out.println("Software Engineer\t10\t\tBachelor's degree\t2");
        System.out.println("Product Manager\t\t5\t\tMaster's degree\t\t0");
        System.out.println("Data Analyst\t\t8\t\tBachelor's degree\t1");
        System.out.println("Sales Representative\t3\t\tBachelor's degree\t0");
        System.out.println("Business Analyst\t\t4\t\tBachelor's degree\t1");
        System.out.println("UX Designer\t\t2\t\tBachelor's degree\t1");
        System.out.println("Quality Assurance\t6\t\tBachelor's degree\t0");
        System.out.println("Software Architect\t2\t\tMaster's degree\t\t0");
        System.out.println("Marketing Specialist\t3\t\tBachelor's degree\t0");
        System.out.println("IT Support\t\t7\t\tAssociate's degree\t2");
        System.out.println("Technical Writer\t\t1\t\tBachelor's degree\t0");
        System.out.println("Project Manager\t\t4\t\tMaster's degree\t\t1");
        System.out.println("Network Administrator\t2\t\tAssociate's degree\t0");
        System.out.println("Customer Service\t\t3\t\tHigh school diploma\t0");
        System.out.println("Financial Analyst\t\t2\t\tMaster's degree\t\t1");
    }





//MYSQL
    public static void printQueriesCSV() {
        String csvFile = "queries.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] queries = line.split(cvsSplitBy);
                for (String query : queries) {
                    System.out.print(query + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



//mysql
public static void deleteStudentsWithLowGPA(String filename, double minGPA) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filename));
         BufferedWriter writer = new BufferedWriter(new FileWriter(filename + ".tmp"))) {

        String line;
        while ((line = reader.readLine()) != null) {
            String[] columns = line.split(",");
            double gpa = Double.parseDouble(columns[2]);
            if (gpa >= minGPA) {
                writer.write(line);
                writer.newLine();
            }
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    try {
        Files.move(Paths.get(filename + ".tmp"), Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
        e.printStackTrace();
    }
}





}**/

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class PlacementQuizView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String displayOptions() {
        System.out.println("Please select an option:");
        System.out.println("a. Take Placement Quiz");
        System.out.println("b. About Intuit");
        System.out.println("c. Placement Statistics");
        System.out.println("d. View queries");
        System.out.println("e. Delete students with lower GPA");
        System.out.println("f. Add job");
        System.out.println("g. Exit");
        return scanner.nextLine();
    }

    public static boolean confirmQuiz() {
        System.out.println("Do you want to take the placement quiz now?");
        System.out.println("A. Yes");
        System.out.println("B. No");
        return scanner.next().equals("A");
    }

    public static String[] getAnswers() {
        String[] answers = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Question " + (i + 1) + ": " + PlacementQuiz.getQuestions()[i]);
            System.out.println("A. " + PlacementQuiz.getAnswers()[i]);
            System.out.println("B. " + PlacementQuiz.getAnswers()[i].toLowerCase());
            System.out.println("C. " + PlacementQuiz.getAnswers()[i].toLowerCase() + "!");
            answers[i] = scanner.next().toUpperCase();
        }
        return answers;
    }

    public static void displayScore(int score) {
        System.out.println("Your score is " + score + " out of 3.");
    }

    public static void displayAboutIntuit() {
        System.out.println("Intuit is a financial software company that develops and sells financial,\n" +
                "accounting, and tax preparation software for individuals and small businesses.\n" +
                "The company has a great work culture that values innovation, collaboration,\n" +
                "and customer obsession. We strive to create a work environment that empowers\n" +
                "employees to be their best selves and achieve their full potential.");
        System.out.println("Frequently Asked Questions:");
        System.out.println("Q. What is Intuit's approach to innovation?\n" +
                "A. At Intuit, we believe that innovation can come from anywhere and anyone.\n" +
                "We encourage our employees to think outside the box and experiment with new ideas.\n" +
                "Q. How does Intuit foster collaboration among its employees?\n" +
                "A. We have a strong culture of collaboration at Intuit. Our employees work in small\n" +
                "cross-functional teams that are empowered to make decisions and drive impact. We also have a variety of\n" +
                "collaboration tools and spaces that encourage teamwork and communication.\n" +
                "Q. What is Intuit's customer obsession philosophy?\n" +
                "A. At Intuit, we are committed to putting our customers at the center of everything\n" +
                "we do. We listen to their needs, understand their pain points, and strive to deliver\n" +
                "solutions that help them succeed.");
        System.out.println("If you have any further queries, please reach out to us at HRshitha@intuit.com.");
    }

    public static void displayPlacementStats() {
        System.out.println("Random Placement Statistics of Intuit for Last 3 Years:");
        System.out.println("Job Title\t\tCandidates Hired\tQualifications\tCandidates Hired from PES University");
        System.out.println("Software Engineer\t10\t\tBachelor's degree\t2");
        System.out.println("Product Manager\t\t5\t\tMaster's degree\t\t0");
        System.out.println("Data Analyst\t\t8\t\tBachelor's degree\t1");
        System.out.println("Sales Representative\t3\t\tBachelor's degree\t0");
        System.out.println("Business Analyst\t\t4\t\tBachelor's degree\t1");
        System.out.println("UX Designer\t\t2\t\tBachelor's degree\t1");
        System.out.println("Quality Assurance\t6\t\tBachelor's degree\t0");
        System.out.println("Software Architect\t2\t\tMaster's degree\t\t0");
        System.out.println("Marketing Specialist\t3\t\tBachelor's degree\t0");
        System.out.println("IT Support\t\t7\t\tAssociate's degree\t2");
        System.out.println("Technical Writer\t\t1\t\tBachelor's degree\t0");
        System.out.println("Project Manager\t\t4\t\tMaster's degree\t\t1");
        System.out.println("Network Administrator\t2\t\tAssociate's degree\t0");
        System.out.println("Customer Service\t\t3\t\tHigh school diploma\t0");
        System.out.println("Financial Analyst\t\t2\t\tMaster's degree\t\t1");
    }






    public static void printQueriesCSV() {
        String csvFile = "queries.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] queries = line.split(cvsSplitBy);
                for (String query : queries) {
                    System.out.print(query + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




public static void deleteStudentsWithLowGPA(String filename, double minGPA) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filename));
         BufferedWriter writer = new BufferedWriter(new FileWriter(filename + ".tmp"))) {

        String line;
        while ((line = reader.readLine()) != null) {
            String[] columns = line.split(",");
            double gpa = Double.parseDouble(columns[2]);
            if (gpa >= minGPA) {
                writer.write(line);
                writer.newLine();
            }
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    try {
        Files.move(Paths.get(filename + ".tmp"), Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
        e.printStackTrace();
    }
}





}

