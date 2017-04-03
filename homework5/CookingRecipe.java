import java.util.ArrayList;
public class CookingRecipe{
	
	private String name;
	private ArrayList<RecipeIngredient> list = new ArrayList<RecipeIngredient>();
	
	public CookingRecipe(String name){
		this.name = name;
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
		RecipeIngredient mInput = new RecipeIngredient(ingredient, quantity);
		if (list.contains(ingredient)) {
			list.set(list.indexOf(ingredient), mInput);
		} else {
			list.add(mInput);
		}
	}
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
		if (!(list.contains(ingredient))){
			return null;
		} else {
			return list.get(list.indexOf(ingredient));
		}
	}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName){
		return null;
	}
}
	
		