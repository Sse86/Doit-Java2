package Doit_dowhile;

public class Continue_Label {

	public static void main(String[] args) {
		POS1:
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(j==3) {
						continue POS1;
					}
					System.out.println(i+", "+j);
				}
			}

	}

}
