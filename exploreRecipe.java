import java.util.*;


public class exploreRecipe {
    public int explore(String selected, Recipe chosenRecipe) {
        boolean x = true;
        if (selected.equals("S") || selected.equals("s")) {
            System.out.println("\n");
            System.out.println("Recipe Name: " + chosenRecipe.gettitle());
            System.out.println("Recipe Description: " + chosenRecipe.getDescription());
            System.out.println("\n");
            Scanner ready = new Scanner(System.in);
            int i = 0;
            System.out.println("Ingredient 1: " + chosenRecipe.getIng(i));
            System.out.println("Enter 'next' when ready to move onto the next ingredient");
            String readyOrNot = ready.nextLine();
            if (readyOrNot.equals("next") || readyOrNot.equals("Next")) {
                for (int j = 0; j < chosenRecipe.ingredients.size()-1; j++) {
                    System.out.println("Ingredient " + (j+2) + ": " + chosenRecipe.getIng(j+1));
                    System.out.println("Enter 'next' when ready to move onto the next ingredient");
                    String readyOrNot2 = ready.nextLine();
                    // if (readyOrNot2.equals("next") || readyOrNot2.equals("Next")) {
                        
                    // } else { 
                    //     System.out.println("Invalid Command: Try again");
                    // }
                    ready.reset();
                }
            } 
            System.out.println("End of ingredients");
            System.out.println("*-------------------------------------------------------*");
            System.out.println("\n");
            int d = 0;
            System.out.println("Enter 'next' when ready to move onto the next instruction");
            String readyOrNot3 = ready.nextLine();
            if (readyOrNot3.equals("next") || readyOrNot3.equals("Next")) {
                for (int y = 0; i < chosenRecipe.instructions.size()-1; y++) {
                    int comparer = chosenRecipe.instructions.size();
                    if (y == comparer) {
                        return(0);
                    }
                    System.out.println("this is iteration: " + y);
                    System.out.println("Step " + (y+1) + ": " + chosenRecipe.getInst(y));
                    System.out.println("Enter 'next' when ready to move onto the next instruction");
                    
                    String readyOrNot4 = ready.nextLine();
                    ready.reset();
                }
            } 
            else {
                System.out.println("Invalid Command: Try again");
            }
                
        } else if (selected.equals("e") || selected.equals("E")) {
            System.out.println(chosenRecipe);
        } else {
            System.out.println("Option Unavailable");
        }
        return(0);
    }
}
