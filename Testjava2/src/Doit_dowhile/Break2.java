package Doit_dowhile;

public class Break2 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j==3)
					break;
				System.out.println(i+", "+j);
			}
		}
	}

}
