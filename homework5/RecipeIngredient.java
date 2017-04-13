// Edward Tsang
// 111335103
// CSE 114
// Homework #5

public class RecipeIngredient extends Ingredient{
	
	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity){
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	
	//Additional constructor created for converting Ingredient to RecipeIngredient in class CookingRecipe
	public RecipeIngredient(Ingredient ingredient, float quantity){
		super(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit());
		this.quantity = quantity;
	}
	public float getQuantity(){
		return this.quantity;
	}
	
	public void setQuantity(float quantity){
		this.quantity = quantity;
	}
	
	public String toString(){
		String output = "RecipeIngredient\n" + "name="+ super.getName() +"\n" + "measuringUnit=" + super.getMeasuringUnit() + "\n" + "caloriesPerUnit=" + super.getCaloriesPerUnit() +"\n" + "quantity=" + this.quantity;
		return output;
	}
	
	public boolean equals(RecipeIngredient second){
		return (super.getName().equals(second.getName()) && (super.getMeasuringUnit().equals(second.getMeasuringUnit())) && (super.getCaloriesPerUnit() == second.getCaloriesPerUnit()) && (this.quantity == second.getQuantity()));
	}
}