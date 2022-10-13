import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String title;
    private String description;
    private List<String> ingredients;
    private List<String> instructions;

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

    public String toString(){
        StringBuffer data = new StringBuffer();
        data.append(title + "\n # \n");
        data.append(description + "\n # \n");
        for (String ingredient : ingredients){
            data.append(ingredient + "\n");
        }
        data.append("\n #");
        for (String instruction : instructions){
            data.append(instruction + "\n");
        }

        return data.toString();
    }
}
