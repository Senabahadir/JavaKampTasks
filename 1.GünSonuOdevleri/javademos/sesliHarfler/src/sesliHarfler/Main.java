package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';  //A-> kal�n sesli harf,   E -> �nce sesli bir harf.
		
		/*if (harf == 'E' || harf == '�' || harf == '�' || harf == '�' ) {
			System.out.println("�nce sesli harf");
		}
		*/
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break;
			default:
				System.out.println("�nce sesli harf");
		}

	}

}
