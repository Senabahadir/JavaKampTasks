package loopDemo;       

public class Main {
	
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println(" for d�ng�s� bitti");
		
		//while
		
		
		int i = 1;       
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println(" while d�ng�s� bitti");
		
		
		// Do-While 
		int j=100;
		do {                                 // �nce do �al���r. sonras�nda ko�ulu sa�larsa while.
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		
	}

}
