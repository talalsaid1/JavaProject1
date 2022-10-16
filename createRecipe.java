import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//As a user I want to be able to create recipes in the recipe book with the ingredient list and a step by step instruction so that I can store and recreate them easily

//Acceptance Criteria:

//Being able to add a name, a description, an ingredient list, and step-by-step cooking instructions

//Makes sure all inputs are completed

//Automatically saves the recipe

class createRecipe{

    Scanner scan = new Scanner(System.in);
    //title
    public void recipeTitle(Recipe recipe){
        
        System.out.println("Please enter the title of the recipe:");
        
        String recipeTitle = scan.nextLine();
        recipe.settitle(recipeTitle);
    }

    //description
    public void recipeDescription(Recipe recipe){
        
        System.out.println("Please enter the description of the recipe:");

        String receipeDescription = scan.nextLine();
        recipe.setdescription(receipeDescription);
    }

    //ingredient list
    public void ingrdList(Recipe recipe) {
        System.out.println("Please enter your ingredients one by one (Enter 'done' when you are done): ");
        boolean x = true;
        while (x) {
            
            String userIng = scan.nextLine();
            if (userIng.equals("done")) {
                    break;
            } else {
                recipe.addingredient(userIng);
            }
        }
    }
    
    //Instructions
    public void instructions(Recipe recipe) {
    
        System.out.println("Please enter your instructions one by one" + "\n(Enter 'done' when you are done): ");

        boolean x = true;
        while (x) {
            String userInstructions = scan.nextLine();
            if (userInstructions.equals("done")) {
                x = false;
            } else {
               recipe.addinstructions(userInstructions);
            }
        }
    }

    public Recipe callAll()throws IOException {
        createRecipe alsoAFiller = new createRecipe(); 
        Recipe recipe = new Recipe();
        //Calling all methods
        alsoAFiller.recipeTitle(recipe);
        alsoAFiller.recipeDescription(recipe);
        alsoAFiller.ingrdList(recipe);
        alsoAFiller.instructions(recipe);
        return recipe;
    }
}
