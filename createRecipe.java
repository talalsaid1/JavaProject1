import java.util.Scanner;
import java.util.*;
//As a user I want to be able to create recipes in the recipe book with the ingredient list and a step by step instruction so that I can store and recreate them easily

//Acceptance Criteria:

//Being able to add a name, a description, an ingredient list, and step-by-step cooking instructions

//Makes sure all inputs are completed

//Automatically saves the recipe

class createRecipe{
    
    //title
    public void recipeTitle(String[] args){
        Scanner title = new Scanner(System.in);
        System.out.println("Please enter the title of the recipe:");
        
        String receipeTitle = title.nextLine();
        System.out.println("Your recipe title is: " + receipeTitle);
    }

    //description
    public void recipeDescription(String[] args){
        Scanner description = new Scanner(System.in);
        System.out.println("Please enter the description of the recipe:");

        String receipeDescription = description.nextLine();
        System.out.println("Your recipe description is: " + receipeDescription);
    }

    //ingredient list -- dynamic array
    public void ingrdList(String[] args) {
        ArrayList<String> mylist = new ArrayList<String>();
        //Value for while loop

        System.out.println("Please enter your ingredients one by one (Enter 'done' when you are done): ");
        boolean x = true;
        while (x) {
            Scanner list = new Scanner(System.in);
            //Fix user experience for prompting
            String userIng = list.nextLine();
            if (userIng.equals("done")) {
                    break;
            } else {
                mylist.add(userIng);
            }
        }
        
        for(int i = 0; i < mylist.size(); i++) {   
            System.out.print(mylist.get(i));
        }
    }
    
    //Instructions
    public void instructions(String[] args) {

        ArrayList<String> instructionsList = new ArrayList<String>(); 

        //Possible move to inside of 
        System.out.println("Please enter your instructions one by one" + "\n(Enter 'done' when you are done): ");

        boolean x = true;
        while (x) {
            Scanner input = new Scanner (System.in);

            String userInstructions = input.nextLine();
            if (userInstructions.equals("done")) {
                x = false;
            } else {
               instructionsList.add(userInstructions);
            }
        }
        
        for(int i = 0; i < instructionsList.size(); i++) {   
            System.out.print(instructionsList.get(i));
        }
    }

    public void callAll() {
        String[] filler = {"filling the array for use!"};
        createRecipe alsoAFiller = new createRecipe(); 

        //Calling all methods
        alsoAFiller.recipeTitle(filler);
        alsoAFiller.recipeDescription(filler);
        alsoAFiller.ingrdList(filler);
        alsoAFiller.instructions(filler);
    }
}
