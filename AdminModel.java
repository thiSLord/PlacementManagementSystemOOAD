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

public class AdminModel {
    private static final String JOBS_FILE_NAME = "jobs.csv";
    public static void addJob(String company_name, String position, String location, String description) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(JOBS_FILE_NAME, true));
            writer.write(company_name+ "," + position + "," + location + "," + description + "\n");
            writer.close();
            System.out.println("Job added to portal successful.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
