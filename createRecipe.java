import java.util.Scanner;

//As a user I want to be able to create recipes in the recipe book with the ingredient list and a step by step instruction so that I can store and recreate them easily

//Acceptance Criteria:

//Being able to add a name, a description, an ingredient list, and step-by-step cooking instructions

//Makes sure all inputs are completed

//Automatically saves the recipe

class createRecipe{
    //title
    public static void recipeTitle(String[] args){
        Scanner title = new Scanner(System.in);
        System.out.println("Please enter the title of the recipe:");
        
        String receipeTitle = title.nextLine();
        System.out.println("Your recipe title is: " + receipeTitle);
    }
    //description
    public static void recipeDescription(String[] args){
        Scanner description = new Scanner(System.in);
        System.out.println("Please enter the description of the recipe:");

        String receipeDescription = description.nextLine();
        System.out.println("Your recipe description is: " + receipeDescription);
    }
    //ingredient list -- dynamic array
    
    

    public static void recipeInstructions(String[] args){
        Scanner instructions = new Scanner (System.in);
        System.out.println("Please enter the instructions for this step: ");
        //unfinished
    }
}