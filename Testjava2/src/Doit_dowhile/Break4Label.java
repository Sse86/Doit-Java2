package Doit_dowhile;

public class Break4Label {

	public static void main(String[] args) {
		out:
		for(int i=0;i<10;i++) {
			for(int j=0; j<10;j++) {
				if(j==3)
					break out;
				System.out.println(i+", "+j);
			}
		}

	}

}
