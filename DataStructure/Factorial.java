
public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorialFx(3));

	}
	
	public static int factorialFx(int num){
		
		if(num == 0){
			return 1;
		}else if(num == 1){
			return 1;
		}else{
			return num * factorialFx(num-1) ;
		}
	}

}
