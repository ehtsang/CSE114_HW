// Edward Tsang
// 111335103
// CSE 114
// Homework #5

public class Ingredient{
	
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	public String toString(){
		String output = "Ingredient\n" + "name="+ this.name +"\n" + "measuringUnit=" + this.measuringUnit + "\n" + "caloriesPerUnit=" + this.caloriesPerUnit;
		return output;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getMeasuringUnit(){
		return this.measuringUnit;
	}
	
	public int getCaloriesPerUnit(){
		return this.caloriesPerUnit;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setMeasuringUnit(String measuringUnit){
		this.measuringUnit = measuringUnit;
	}
	
	public void setCaloriesPerUnit(int caloriesPerUnit){
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	public boolean equals(Ingredient second){
		return (this.name.equals(second.getName()) && (this.measuringUnit.equals(second.getMeasuringUnit())) && (this.caloriesPerUnit == second.getCaloriesPerUnit()));
	}
}