package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 -> 1,2,3
		// 28-> 1,2,4,7,14
		
		int number = 25;
		int bolen = 0;
		
		for(int i =1; i<number; i++) {
			if (number % i == 0) {
				bolen = bolen +i;
			}
		}
		
		if (number == bolen) {
			System.out.println("M?kemmel Say?");
		}else {
			System.out.println("M?kemmel Say? De?ildir");
		}
	}

}
