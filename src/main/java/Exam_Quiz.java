import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Exam_Quiz {
    public static void main(String[] args) throws IOException, ParseException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 for Adding a question \nEnter 2 for giving a quiz exam.");
            System.out.println("1. Add Quiz\n" + "2. Start Quiz");
            System.out.println("Your Options are:");
            int options = scanner.nextInt();


            if (options == 1) {
                Create_Questions.createQuestion();
                System.out.println("Thank you for adding Question.");
            } else if (options == 2) {
               Give_Quiz.giveQuiz();
                System.out.println("Thanks for Participating in the quiz.");
            } else {
                System.out.println("Invalid");
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception!!!");
        }
    }
}
