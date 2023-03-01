import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Create_Questions {
    static void createQuestion() throws IOException, ParseException {
        try {
            char choiceInput = 'y';
            do {
                JSONParser jsonParser = new JSONParser();
                Object obj = jsonParser.parse(new FileReader("./src/main/resources/QuestionsList.json"));
                JSONArray jsonArray = (JSONArray) obj;

                Scanner scanner = new Scanner(System.in);

                JSONObject addQs = new JSONObject();

                System.out.println("Please add a question here:");
                System.out.println("Question:");
                addQs.put("Question", scanner.nextLine());
                System.out.println("Input options:");
                System.out.println("Option a:");
                addQs.put("Option a", scanner.nextLine());
                System.out.println("Option b:");
                addQs.put("Option b", scanner.nextLine());
                System.out.println("Option c:");
                addQs.put("Option c", scanner.nextLine());
                System.out.println("Option d:");
                addQs.put("Option d", scanner.nextLine());
                System.out.println("Please insert the correct answer:");
                addQs.put("Answer", scanner.nextLine());

                jsonArray.add(addQs);

                FileWriter fileWriter = new FileWriter("./src/main/resources/QuestionsList.json");
                fileWriter.write(jsonArray.toString());
                fileWriter.flush();
                System.out.println("Quiz saved successfully in Database. Do you want to add more? (y/n)");
                choiceInput = scanner.next().charAt(0);
            }
            while (choiceInput == 'y'); {

            }
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
