import java.util.Scanner;
public class PlacementQuizController {
    public static void run() {
        int flag = 1;
        while(flag!=0){
        try{
        String option = PlacementQuizView.displayOptions();
        switch (option) {
            case "a":
                if (!PlacementQuizView.confirmQuiz()) {
                    System.out.println("You can take the test before 01/05/2023.");
                    return;
                }
                String[] userAnswers = PlacementQuizView.getAnswers();
                int score = PlacementQuiz.calculateScore(userAnswers);
                PlacementQuizView.displayScore(score);
                break;
            case "b":
                PlacementQuizView.displayAboutIntuit();
                break;
            case "c":
                PlacementQuizView.displayPlacementStats();
                break;

            case "d":
                PlacementQuizView.printQueriesCSV();
                break;
            case "e":
                Scanner scanner = new Scanner(System.in);                        
                System.out.print("Enter a cutoff cgpa value: ");
                double input = scanner.nextDouble();
                PlacementQuizView.deleteStudentsWithLowGPA("students.csv",input);
                scanner.close();
                break;
            case "f":
                Scanner sc  = new Scanner(System.in);
                System.out.println("Enter company:");
                String company_name = sc.nextLine();
                System.out.println("Enter job position:");
                String position = sc.nextLine();
                System.out.println("Enter location:");
                String location = sc.nextLine();
                System.out.println("Enter job description:");
                String job_description = sc.nextLine();
                AdminModel.addJob(company_name,position,location,job_description);
                sc.close();
                break;
            case "g":
                System.out.println("Exiting...");
                flag=0;
                break;
            default:
                System.out.println("Invalid option selected.");
                flag=0;
        }
    }
    catch(Exception e){
        System.out.println("");
        flag=0;
    }
    }
    }
}
