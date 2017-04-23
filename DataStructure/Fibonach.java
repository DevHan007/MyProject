
public class Fibonach {

	public static void main(String[] args) {
		System.out.println(fibonachFx(6));
	}

	public static int fibonachFx(int num){
		if(num == 1){
			return 1;
		}else if(num == 2){
			return 1;
		}else{
			return fibonachFx(num-1) +fibonachFx(num-2);
		}
	}
	
}
