import java.util.Arrays;
import java.util.ArrayList;
public class RecipeBook{
	
	private String bookName;
	private ArrayList<CookingRecipe> list = new ArrayList<CookingRecipe>();
	
	public RecipeBook(String bookName){
		this.bookName = bookName;
	}
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
		for (CookingRecipe i : list){
			if (i.getName().equals(name)){
				return null;
			}
		}
		CookingRecipe output = new CookingRecipe(name, ingredients);
		list.add(output);
		return output;
	}
	
	public CookingRecipe removeRecipe(String name){
		for (CookingRecipe i :list){
			if (i.getName().equals(name)){
				list.remove(i);
				return i;
			}
		}
		return null;
	}
	
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
		ArrayList<CookingRecipe> output = new ArrayList<CookingRecipe>();
		for (CookingRecipe i : list){
			if (i.getList().contains(ingredients)){
				output.add(i);
			}
		}
		if (output.size() == 0) {
			return null;
		} else {
			return output.toArray(new CookingRecipe[output.size()]);
		}
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
		ArrayList<CookingRecipe> output = new ArrayList<CookingRecipe>();
		for (CookingRecipe i : list){
			if (i.getList().size() < numberOfIngredients){
				output.add(i);
			}
		}
		if (output.size() == 0) {
			return null;
		} else {
			return output.toArray(new CookingRecipe[output.size()]);
		}
	}
	
	public CookingRecipe[] findRecipesLowCalories(){
		float current = list.get(0).calculateCalories();
		ArrayList<CookingRecipe> output = new ArrayList<CookingRecipe>();
		for (CookingRecipe i : list){
			if (i.calculateCalories() <= current){
				current = i.calculateCalories();
				output.add(i);
			}
		}
		if (output.size() == 0) {
			return null;
		} else {
			return output.toArray(new CookingRecipe[output.size()]);
		}
	}
	
	//Still requires toString and equals overloaded methods
}