// Edward Tsang
// 111335103
// CSE 114
// Homework #5

public class TestRecipeBook{
	
	public static void main(String[] args){
		Ingredient eggs = new Ingredient("eggs", "grams", 25);
		Ingredient eggs2 = new Ingredient("eggs", "grams", 10);
		Ingredient eggs3 = new Ingredient("eg", "ounces", 25);
		Ingredient eggs4 = new Ingredient("eggs", "grams", 25);
		
		System.out.println("Ingredient test:");
		System.out.println("toString implementation:");
		System.out.println(eggs);
		System.out.println(eggs2);
		System.out.println(eggs3);
		System.out.println(eggs4);
		System.out.println("end toString testing");
		System.out.println("");
		
		System.out.println("equals implementation:");
		System.out.println(eggs.equals(eggs2));//false
		System.out.println(eggs.equals(eggs3));//false
		System.out.println(eggs.equals(eggs4));//true
		System.out.println("end equals testing");
		System.out.println("");
		
		System.out.println("end Ingredient object testing");
		System.out.println("");
		
		
		RecipeIngredient beef = new RecipeIngredient("beef", "grams", 25, 2);
		RecipeIngredient beef2 = new RecipeIngredient("beef", "grams", 2, 2);
		RecipeIngredient beef3 = new RecipeIngredient("beef", "ounces", 25, 2);
		RecipeIngredient beef4 = new RecipeIngredient("bef", "grams", 25, 2);
		RecipeIngredient beef5 = new RecipeIngredient("beef", "grams", 25, 2);
		
		System.out.println("RecipeIngredient test:");
		System.out.println("toString implementation:");
		System.out.println(beef);
		System.out.println(beef2);
		System.out.println(beef3);
		System.out.println(beef4);
		System.out.println(beef5);
		System.out.println("end toString testing");
		System.out.println("");
		
		System.out.println("end RecipeIngredient object testing");
		System.out.println("");
		
		
		CookingRecipe stew = new CookingRecipe("stew");
		stew.addOrUpdateRecipeIngredient(eggs, 2);
		System.out.println(stew.getNumberOfIngredients());
		stew.addOrUpdateRecipeIngredient(eggs, 3);
		System.out.println(stew.getNumberOfIngredients());
		stew.addOrUpdateRecipeIngredient(eggs2, 1);
		System.out.println(stew.getNumberOfIngredients());
		System.out.println(stew);
		
		System.out.println(stew.getRecipeIngredient(eggs));
		System.out.println(stew.getRecipeIngredient("eggs"));
		
		System.out.println(stew.removeRecipeIngredient(eggs2));
		System.out.println(stew.removeRecipeIngredient("eggs2"));
		System.out.println(stew.calculateCalories());
		System.out.println(stew.getNumberOfIngredients());
		System.out.println(stew);
		System.out.println("");
		
		RecipeBook book = new RecipeBook("book");
		System.out.println(book.addRecipe("cooked_eggs", new RecipeIngredient[]{beef, beef4, beef3}));
		System.out.println(book.addRecipe("cooked_eggs", new RecipeIngredient[]{beef2, beef3, beef5}));
		System.out.println(book.addRecipe("roasted beef", new RecipeIngredient[]{beef, beef2}));
		System.out.println(book);
		System.out.println(book.findRecipes(new RecipeIngredient[]{beef, beef2}));
		System.out.println(book.findRecipes(new RecipeIngredient[]{beef4}));
		System.out.println(book.findRecipes(new RecipeIngredient[]{beef5}));
		System.out.println(book.findRecipesWithFewIngredients(4));
		System.out.println(book.findRecipesWithFewIngredients(1));
		System.out.println(book.findRecipesLowCalories());
		
		}
		
}
		
		
		