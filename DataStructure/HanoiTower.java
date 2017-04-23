
public class HanoiTower {

	public static void main(String[] args) {
		char from  = 'A';
		char by = 'B';
		char to = 'C';
		
		HanoiMove(3,from,by,to);
		
	}

	
	public static void HanoiMove(int num, char from, char by, char to){
		
		if(num ==1){
			System.out.println("원반1 을 "+from+" 에서 "+to+" 로 이동했습니다.");
			return;
		}else{
			HanoiMove(num-1, from, to, by);
			System.out.println("원반 "+(num)+" 을 "+from+" 에서 "+to+" 로 이동했습니다.");
			HanoiMove(num-1, by, from, to);
		}
		
	}
	
}
