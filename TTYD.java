import java.io.IOException;
import java.util.*;

public class TTYD {
	public static void main(String[] args)throws IOException {
        createRecipe forCreation = new createRecipe();

        

        while (true) {
            //Asking user to select
            Scanner askMain = new Scanner(System.in);
            System.out.println("\n \n");
            System.out.println("Enter a number to select from the following Menu Options: \n");
            System.out.println("*-------------------------------------------------------* \n");
            System.out.println("    1. Create recipe \n");
            System.out.println("    2. Explore Recipes \n");
            System.out.println("    3. How to use? \n");
            System.out.println("    4. Exit \n");
            System.out.println("*-------------------------------------------------------* \n");

            //User input
            String userAnswer = askMain.nextLine();
            if (userAnswer.equals("4")) {
                break;
            } else if (userAnswer.equals("1")) {
                System.out.println("\n");
                forCreation.callAll();
            } else if (userAnswer.equals("2")) {
                //Fill in with another callAll once created
            } else if (userAnswer.equals("3")) {
                System.out.println("Hello! This section will explain the functions of this program \n On our main menue you are presented two options: \n 1. To create a recipe \n Or to Search for previously created recipes. \n If you choose to create a recipee you will be asekd for: \n 1. Recipe Title \n 2. Recipe Description \n 3. Ingrediens \n 4. Instrcutions \n The information will automatically be saved. Note: For functions that require more than one input please type 'done' when finished to move on to the next step.");
                System.out.println("As for searching for a previously saved recipe:"); //Continue when search is finished
            } else {
                System.out.println("Invalid Command, Try Again :)");
                continue;
            }
        }
	}   
}