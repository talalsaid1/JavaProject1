public class TTYD {
	public static void main(String[] args) {
		//recipe.printArray();

        String[] testString = {"helllllooooooooo", "i am testing", "this is another test"};

        //Testing
        createRecipe testing = new createRecipe();
        testing.recipeTitle(testString);
        testing.recipeDescription(testString);
        testing.ingrdList(testString);
        testing.instructions(testString);
	}   
}