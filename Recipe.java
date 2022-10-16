import java.util.ArrayList;
import java.util.List;

public class Recipe {

    public String title;
    public String description;
    public List<String> ingredients;
    public List<String> instructions;

    public Recipe() {
        ingredients = new ArrayList<String>();
        instructions = new ArrayList<String>();
    
        
    }

    public void settitle(String intitle){
        this.title = intitle;
    } 

    public void setdescription(String indescription){
        this.description = indescription;
    } 

    public void addingredient (String ingredient){
        ingredients.add(ingredient);
    }

    public void addinstructions (String instruction){
        instructions.add(instruction);
    }

    public String gettitle(){
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getIngrident(int i) {
        return ingredients.get(i);
    }
    public List<String> getInstructions() {
        return instructions;
    }
    public List<String> getIngridients(){
        return ingredients;
    }

    //for file format
    public String toString(){
        StringBuffer data = new StringBuffer();
        data.append("Title: # \n" + title + "# \n");

        data.append("Description: \n" + description + "# \n");

        data.append("Ingredeint: \n");
        for (String ingredient : ingredients){
            int counter = 1;
            data.append(counter +ingredient + "\n");
            counter ++;
        }
        data.append("\n #");

        data.append("Instructions: \n");
        for (String instruction : instructions){
            int counter = 1;
            data.append(counter + instruction + "\n");
            counter ++;
        }

        return data.toString();
    }

    public String userToString(){
        StringBuffer data = new StringBuffer();
        data.append("\nTitle: \n" + title + "\n");

        data.append("\nDescription: \n" + description + "\n");

        data.append("\nIngredients: \n");
        for (int index = 0; index < ingredients.size(); index++){
            String ingredient = ingredients.get(index);
            data.append((index+1) + ". " + ingredient + "\n");
        }

        data.append("\nInstructions: \n");
        for (int index = 0; index < instructions.size(); index++){
            String instruction = instructions.get(index);
            data.append((index+1) + ". " + instruction + "\n");
        }
        return data.toString();
    }
}
