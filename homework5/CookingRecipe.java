import java.util.ArrayList;
import java.util.Arrays;
public class CookingRecipe{
	
	private String name;
	private ArrayList<RecipeIngredient> list = new ArrayList<RecipeIngredient>();
	
	public CookingRecipe(String name){
		this.name = name;
	}
	
	public CookingRecipe(String name, RecipeIngredient[] ingredients){
		this.name = name;
		this.list = new ArrayList<RecipeIngredient>(Arrays.asList(ingredients));
	}
	
	public String getName(){
		return this.name;
	}
	
	public ArrayList<RecipeIngredient> getList(){
		return this.list;
	}
	
	public boolean check(Ingredient second, ArrayList<RecipeIngredient> lis){
		boolean output = false;
		for (RecipeIngredient i : lis){
			if (i.getName().equals(second.getName()) && i.getMeasuringUnit().equals(second.getMeasuringUnit()) && (i.getCaloriesPerUnit() == second.getCaloriesPerUnit())){
				output = true;
			}
		}
		return output;
	}
	
	public int cIndexOf(Ingredient second, ArrayList<RecipeIngredient> lis){
		int output = -1;
		for (int i = 0; i < lis.size(); i++){
			if (lis.get(i).getName().equals(second.getName()) && lis.get(i).getMeasuringUnit().equals(second.getMeasuringUnit()) && (lis.get(i).getCaloriesPerUnit() == second.getCaloriesPerUnit())){
				output = i;
				break;
			}
		}
		return output;
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
		RecipeIngredient mInput = new RecipeIngredient(ingredient, quantity);
		if (check(ingredient, list)) {
			list.set(list.indexOf(ingredient), mInput);
		} else {
			list.add(mInput);
		}
	}
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
		if (!(check(ingredient, list))){
			return null;
		} else {
			return list.get(list.indexOf(ingredient));
		}
	}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName){
		boolean test = false;
		for (RecipeIngredient i : list){
			if (i.getName().equals(ingredientName)){
				return i;
			}
		}
		return null;
	}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
		if (check(ingredient, list)){
			return list.remove(cIndexOf(ingredient, list));
		} else {
			return null;
		}
	}
	
	public RecipeIngredient removeRecipeIngredient(String ingredientName){
		for (RecipeIngredient i : list){
			if (i.getName().equals(ingredientName)){
				list.remove(i);
				return i;
			}
		}
		return null;
	}
	
	public float calculateCalories(){
		float output = 0;
		for (RecipeIngredient i : list){
			output += (i.getCaloriesPerUnit() * i.getQuantity());
		}
		return output;
	}
	
	public int getNumberOfIngredients(){
		return list.size();
	}
	
	public String toString(){
		String output = "CookingRecipe\n" + "name=" + this.name + "\n";
		for (RecipeIngredient i : list){
			output += i.toString();
		}
		return output;
	}
	
	public boolean equals(CookingRecipe second){
		if (list.size() > second.getList().size()){
			for (RecipeIngredient i : list){
				if (second.getList().indexOf(i) == -1){
					return false;
				}
			}
		} else {
			for (RecipeIngredient i : second.getList()){
				if (list.indexOf(i) == -1){
					return false;
				}
			}
		}
		//return (this.getList().equals(second.getList()) && (this.getName().equals(second.getName())));
		return (this.getName().equals(second.getName()));
	}
				
		
			
		
}

	
		