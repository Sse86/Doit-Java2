package Doit_dowhile;

public class Continue1 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
//i=5 일때 는 continue 가 실행돼 출력 코드가 실행되지 않는다.
// i=5일때를 제외하고 9번의 출력된다. 