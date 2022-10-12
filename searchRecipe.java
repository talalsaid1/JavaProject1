import java.util.*;


public class searchRecipe {
    //search by name/keyword

   
    public static void askInput(String[] args){
        //ask for input
        Scanner userInput = new Scanner(System.in);
        System.out.println("What recipe are you looking for? (enter keyword, or recipe name)");

        String recipeName = userInput.nextLine();

        //match 
        ArrayList <String> list = new ArrayList<String>();
        for (String recipeName: list){
            //return matching recipe in a list
            if (recipeName.contains(userInput)){
                System.out.println("Here's the matching recipes: ");
                System.out.println(recipeName);
            }
        }
    }
}
