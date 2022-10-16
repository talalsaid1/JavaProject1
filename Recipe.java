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
    public String getIng(int i) {
        return ingredients.get(i);
    }
    public String getInst(int i) {
        return instructions.get(i);
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
