import java.util.*;

public class TTYD {
	public static void main(String[] args) {
        createRecipe forCreation = new createRecipe();

        

        while (true) {
            //Asking user to select
            Scanner askMain = new Scanner(System.in);
            System.out.println("\n \n");
            System.out.println("Enter a number to select from the following Menu Options: \n");
            System.out.println("*-------------------------------------------------------* \n");
            System.out.println("    1. Create recipe \n");
            System.out.println("    2. Explore Recipes \n");
            System.out.println("    3. Exit \n");
            System.out.println("*-------------------------------------------------------* \n");

            //User input
            String userAnswer = askMain.nextLine();
            if (userAnswer.equals("3")) {
                break;
            } else if (userAnswer.equals("1")) {
                System.out.println("\n");
                forCreation.callAll();
            } else if (userAnswer.equals("2")) {
                //Fill in with another callAll once created
            } else {
                System.out.println("Invalid Command, Try Again :)");
                continue;
            }
        }
	}   
}