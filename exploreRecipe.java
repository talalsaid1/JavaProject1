import java.util.*;


public class ExploreRecipe {
    public int explore(String selected, Recipe chosenRecipe) {

        if (selected.equals("S") || selected.equals("s")) {
            System.out.println("\n");
            System.out.println("Recipe Name: " + chosenRecipe.gettitle());
            System.out.println("\n");
            System.out.println("Recipe Description: " + chosenRecipe.getDescription());
            System.out.println("\n");
            for(String printingredients : chosenRecipe.getIngridients()){
                System.out.println("Recipe Ingredients: " + printingredients);
            }
            System.out.println("\n");
            Scanner ready = new Scanner(System.in);
            int ingredientindex = 0;
            System.out.println("Press Enter when ready to see the next instruction");
            String readyOrNot = ready.nextLine();
            for(String printinstructions : chosenRecipe.getInstructions()){
                System.out.print(printinstructions);
                ready.nextLine();
            }
            
            System.out.println("\n");
            System.out.println("*-------------------------------------------------------*");
            System.out.println("End of instructions");
            System.out.println("*-------------------------------------------------------*");
            System.out.println("\n");
           
        }    
         else if (selected.equals("e") || selected.equals("E")) {
            System.out.println(chosenRecipe.userToString());
        } else {
            System.out.println("Option Unavailable");
        }
        return(0);
    }
}
