public class Complex{
	
	double a, b;
	public Complex(){
		this.a = 0;
		this.b = 0;
	}
	
	public Complex(double a){
		this.a = a;
		this.b = 0;
	}
	
	public Complex(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double getRealPart(){
		return this.a;
	}
	
	public double getImaginaryPart(){
		return this.b;
	}
	
	public Complex add(Complex second){
		Complex output = new Complex(this.a + second.getRealPart(), this.b + second.getImaginaryPart());
		return output;
	}
	
	public Complex subtract(Complex second){
		Complex output = new Complex(this.a - second.getRealPart(), this.b - second.getImaginaryPart());
		return output;
	}
	
	public Complex multiply(Complex second){
		Complex output = new Complex((this.a * second.getRealPart() + this.b * second.getImaginaryPart()) / (Math.pow(second.getRealPart(),2) + Math.pow(second.getImaginaryPart(), 2)), (this.b * second.getRealPart() - this.a * second.getImaginaryPart())/(Math.pow(second.getRealPart(),2) + Math.pow(second.getImaginaryPart(), 2)));
		return output;
	}
	
	public String toString(){
		String output = "";
		if (this.b == 0){
			output += this.a;
		} else {
			output = "(" + this.a + " + " + this.b +"i)";
		}
		return output;
	}
}
			