public class MyPoint{
	
	double x, y;
	
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double distance(MyPoint input){
		return Math.sqrt(Math.pow(this.x - input.getX(), 2) + Math.pow(this.y - input.getY(), 2));
	}
	
	public double distance(double x, double y){
		return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y, 2));
	}
}