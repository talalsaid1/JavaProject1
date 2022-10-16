import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TTYD {
	public static void main(String[] args)throws IOException {
        createRecipe forCreation = new createRecipe();
        List<Recipe> recipes = new ArrayList<Recipe>();
        
       
        while (true) {
            //Asking user to select
            System.out.println("\n \n");
            System.out.println("Enter a number to select from the following Menu Options: \n");
            System.out.println("*-------------------------------------------------------* \n");
            System.out.println("    1. Create recipe \n");
            System.out.println("    2. Search All Recipes \n");
            System.out.println("    3. Search Recipe By Title \n");
            System.out.println("    4. How to use? \n");
            System.out.println("    5. Exit \n");
            System.out.println("*-------------------------------------------------------* \n");

            //User input
            Scanner askMain = new Scanner(System.in);
            String userAnswer = askMain.nextLine();
            if (userAnswer.equals("5")) {
                break;
            } else if (userAnswer.equals("1")) {
                System.out.println("\n");
                Recipe addrecipe = forCreation.callAll();
                recipes.add(addrecipe);
            }
            else if(userAnswer.equals("2")){
                if(recipes.isEmpty()){
                    System.out.println("No saved recipes found");
                }
                else{
                    for(int index = 0; index < recipes.size(); index++) {
                        Recipe printRecipe = recipes.get(index);
                        System.out.println((index+1)+ ": " + printRecipe.gettitle() + "\n");
                    }
                    System.out.println("Select a recipe number to print");
                    int recipenumber = askMain.nextInt();
                    Recipe chosenRecipe = recipes.get(recipenumber-1);
                    //Forking into two differnet options
                    System.out.println(" ");
                    System.out.println("Enter S: Explore Step By Step ");
                    System.out.println("Enter E: Display the entire recipe ");
                    Scanner whichInput = new Scanner(System.in);
                    String selected = whichInput.nextLine();
                    ExploreRecipe exploreRecipe = new ExploreRecipe();
                    exploreRecipe.explore(selected, chosenRecipe);
                    System.out.println("press enter to continue");
                    askMain.nextLine();
                    askMain.nextLine();
                }   
            }
            else if (userAnswer.equals("3")) {
                if(recipes.isEmpty()){
                    System.out.println("No saved recipes found");
                }
                else{
                    System.out.println("Insert the recipe title");
                    String input = askMain.nextLine();
                    List<Recipe> results = search(recipes, input);
                    if(results.isEmpty()){
                        System.out.println("No saved recipes found");
                    }
                    else{
                        for(int index=0; index < results.size(); index++){
                            Recipe match = results.get(index);
                            System.out.println((index+1)+ ": " + match.gettitle());
                        }
                        System.out.println("Select a recipe number to print");
                        int recipenumber = askMain.nextInt();
                        askMain.nextLine();
                        Recipe chosen = recipes.get(recipenumber-1);
                        System.out.println("Enter S: Explore Step By Step ");
                        System.out.println("Enter E: Display the entire recipe ");
                        String selected = askMain.nextLine();
                        ExploreRecipe exploreRecipe = new ExploreRecipe();
                        exploreRecipe.explore(selected, chosen);
                        System.out.println("press enter to continue");
                        askMain.nextLine();
                        askMain.nextLine();
                    }
                }
            } 
            else if (userAnswer.equals("4")) {
                System.out.println("Hello! This section will explain the functions of this program \n On our main menue you are presented two options: \n 1. To create a recipe \n Or to Search for previously created recipes. \n If you choose to create a recipee you will be asekd for: \n 1. Recipe Title \n 2. Recipe Description \n 3. Ingrediens \n 4. Instrcutions \n The information will automatically be saved. Note: For functions that require more than one input please type 'done' when finished to move on to the next step.");
                System.out.println("As for searching for a previously saved recipe: There are two options. Either browsing through all saved recipes or searching by keyword (title)");

                System.out.println("\n press enter to continue");
                askMain.nextLine();
                askMain.nextLine();
            } else {
                System.out.println("Invalid Command, Try Again :)");
                continue;
            }
        }
        writeFile(recipes);
       
	} 
     public static void writeFile(List<Recipe> recipes)throws IOException{
        File recipefile = new File("recipe.txt");
        FileWriter writer = new FileWriter(recipefile);
        for(Recipe writeRecipe : recipes){
            String text = writeRecipe.toString();
            writer.write(text);
        }
        writer.close();
        
        }  
     public static List<Recipe> search(List<Recipe> searchRecipes, String keyword){
        List<Recipe> searchresults = new ArrayList<Recipe>();
        for(Recipe match : searchRecipes){
            if(match.gettitle().contains(keyword)){
                searchresults.add(match);
            }
        }
        //Returns an arrayList
        return searchresults;

    }
}