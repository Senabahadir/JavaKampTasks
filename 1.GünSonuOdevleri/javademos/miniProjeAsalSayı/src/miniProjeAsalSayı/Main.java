package miniProjeAsalSay�;

public class Main {
	public static void main(String[] args) {
		
		int number = -2;
		int remainder = number %2; // remainder = kalan
		System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Say� asal de�ildir.");
			return;   /*return yaparak number�n 1 oldu�u durumlarda kodun hem bu sat�rda hemde a�a��daki sat�rda �al��mas�n� engelledik.
			 yoksa ��kt� -> Say� asal de�ildir
			 				Say� asald�r.        �eklinde olacakt�.*/
		}
		
		if(number<1) {
			System.out.println("Ge�ersiz Say�");
			return;
		}
		
		for (int i=2; i<number; i++) {    //En k���k asal say� 2'dir. 1 asal say� de�ildir.
			if(number % i ==0) {
				isPrime = false;
				
			}
		}
		if(isPrime) {            // --> if(isPrime == true)   
			System.out.println("Say� Asald�r");
		}else {
			System.out.println("Say� asal de�ildir.");
		}
	}

}
