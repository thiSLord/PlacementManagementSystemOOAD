import java.util.Scanner;
import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        try{
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Student");
            System.out.println("2. Admin");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    StudentView.main(args);
                    break;
                case 2:
                    Main.main(args);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
    catch(Exception e){
        System.out.println("Job added successfully");
    }
    }
}
