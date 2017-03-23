public class MyInteger{
	
	int value;
	
	public MyInteger(){
		this.value = 0;
	}
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	//Called as such: <MyInteger_name>.isEven()
	public boolean isEven(){
		return (this.value %2 == 0);
	}
	
	public boolean isOdd(){
		return (this.value % 2 != 0);
	}
	
	public boolean isPrime(){
		int hold = (int) Math.sqrt(this.value) + 1;
		for (int i =2; i < hold; i++){
			if (this.value % i ==0){
				return false;
			}
		}
		return true;
	}
	
	//Called as such: MyInteger.isEven(int arg)
	
	public static boolean isEven(int arg){
		return (arg %2 == 0);
	}
	
	public static boolean isOdd(int arg){
		return (arg % 2 != 0);
	}
	
	public static boolean isPrime(int arg){
		int hold = (int) Math.sqrt(arg) + 1;
		for (int i =2; i < hold; i++){
			if (arg % i ==0){
				return false;
			}
		}
		return true;
	}
	
	//Called as such: MyInteger.isEven(MyInteger arg)
	public static boolean isEven(MyInteger arg){
		return (arg.getValue() %2 == 0);
	}
	
	public static boolean isOdd(MyInteger arg){
		return (arg.getValue() % 2 != 0);
	}
	
	public static boolean isPrime(MyInteger arg){
		int hold = (int) Math.sqrt(arg.getValue()) + 1;
		for (int i =2; i < hold; i++){
			if (arg.getValue() % i ==0){
				return false;
			}
		}
		return true;
	}
	
	//equals method and parseInt
	public boolean equals(int arg){
		return this.value == arg;
	}
	
	public boolean equals(MyInteger arg){
		return this.value == arg.getValue();
	}
	
	//The array was unneccessary, for some reason thought that I could stitch together a number with an array
	public static int parseInt(String input){
		String library = "0123456789";
		int[] output = new int[input.length()];
		int ret = 0;
		char working = ' ';
		for (int i = 0; i<input.length(); i++){
			working = input.charAt(i);
			output[i] = library.indexOf(working);
		}
		for (int i =0; i< library.length(); i++){
			ret += output[i] * Math.pow(10, input.length()-1-i);
		}
		return ret;
	}
}
			
