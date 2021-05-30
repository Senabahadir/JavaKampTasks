package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'E';
		
		switch(grade) {
		case 'A' :
			System.out.println("Mükemmel : Geçtiniz");
			break;
			
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
			
		case 'F':
			System.out.println("Maalesef kaldýnýz");
			break;
			
		case 'D':
		case 'E':   // farklý iki koþulda ayný sonucu almasýný istediðimiz zaman böyle yazarýz.
			System.out.println("Geçtiniz");
			break;
			
			
		default:
			System.out.println("Geçersiz not girdiniz");
		}
	}

}
