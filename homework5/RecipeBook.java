// Edward Tsang
// 111335103
// CSE 114
// Homework #5

import java.util.Arrays;
import java.util.ArrayList;
public class RecipeBook{
	
	private String bookName;
	private ArrayList<CookingRecipe> list = new ArrayList<CookingRecipe>();
	
	public RecipeBook(String bookName){
		this.bookName = bookName;
	}
	
	public String getBookName(){
		return this.bookName;
	}
	
	public ArrayList<CookingRecipe> getList(){
		return this.list;
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
	
	//THIS METHOD IS INCORRECT IT WILL LIST ALL THE RECIPES BECAUSE IT ONLY HAS ONE LOOP. SPLIT INTO TWO LOOPS. ONE TO FIND THE MIN, ONE TO FIND ALL RECIPES WITH THE MIN.
	//Above statement is for changelog purposes only, method has since been updated to reflect proper behavior.
	public CookingRecipe[] findRecipesLowCalories(){
		float current = list.get(0).calculateCalories();
		ArrayList<CookingRecipe> output = new ArrayList<CookingRecipe>();
		for (CookingRecipe i : list){
			if (i.calculateCalories() <= current){
				current = i.calculateCalories();
			}
		}
		for (CookingRecipe i : list){
			if (i.calculateCalories() == current){
				output.add(i);
			}
		}
		if (output.size() == 0) {
			return null;
		} else {
			return output.toArray(new CookingRecipe[output.size()]);
		}
	}
	
	
	public String toString(){
		String output = "RecipeBook\n" + "bookName=" + this.bookName + "\n";
		for (CookingRecipe i : list){
			output += i.toString();
		}
		return output;
	}
	
	public boolean equals(RecipeBook second){
		if (list.size() > second.getList().size()){
			for (CookingRecipe i : list){
				if (second.getList().indexOf(i) == -1){
					return false;
				}
			}
		} else {
			for (CookingRecipe i : second.getList()){
				if (list.indexOf(i) == -1){
					return false;
				}
			}
		}
		return (this.getBookName().equals(second.getBookName()));
	}
	
}