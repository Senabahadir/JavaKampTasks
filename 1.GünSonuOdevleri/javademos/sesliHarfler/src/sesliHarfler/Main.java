package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';  //A-> kalýn sesli harf,   E -> Ýnce sesli bir harf.
		
		/*if (harf == 'E' || harf == 'Ý' || harf == 'Ü' || harf == 'Ö' ) {
			System.out.println("Ýnce sesli harf");
		}
		*/
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf");
			break;
			default:
				System.out.println("Ýnce sesli harf");
		}

	}

}
