import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("e")) {
            System.out.println("Choose an option:");
            System.out.println("a. Register for placement");
            System.out.println("b. Raise queries");
            System.out.println("c. View job description");
            System.out.println("d. Edit profile name");
            System.out.println("e. Exit");

            choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter SRN:");
                    String srn = scanner.nextLine();
                    System.out.println("Enter GPA:");
                    String gpa = scanner.nextLine();
                    System.out.println("Enter job ID:");
                    String jobId = scanner.nextLine();
                    System.out.println("Enter email ID:");
                    String emailId = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.nextLine();
                    StudentModel.registerForPlacement(name, srn, gpa, jobId, emailId, phoneNumber);
                    break;
                case "b":
                    System.out.println("Enter name:");
                    name = scanner.nextLine();
                    System.out.println("Enter SRN:");
                    srn = scanner.nextLine();
                    System.out.println("Enter query:");
                    String query = scanner.nextLine();
                    StudentModel.raiseQuery(name, srn, query);
                    break;
                case "c":
                    StudentModel.viewJobDescription();
                    break;
                case "d":
                    System.out.println("Enter SRN:");
                    srn = scanner.nextLine();
                    System.out.println("Enter updated name:");
                    String updatedName = scanner.nextLine();
                    StudentModel.editProfileName(srn, updatedName);
                    break;
                case "e":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}