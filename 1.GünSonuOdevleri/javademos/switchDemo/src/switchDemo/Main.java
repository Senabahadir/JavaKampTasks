package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'E';
		
		switch(grade) {
		case 'A' :
			System.out.println("M�kemmel : Ge�tiniz");
			break;
			
		case 'B':
			System.out.println("�ok G�zel : Ge�tiniz");
			break;
			
		case 'F':
			System.out.println("Maalesef kald�n�z");
			break;
			
		case 'D':
		case 'E':   // farkl� iki ko�ulda ayn� sonucu almas�n� istedi�imiz zaman b�yle yazar�z.
			System.out.println("Ge�tiniz");
			break;
			
			
		default:
			System.out.println("Ge�ersiz not girdiniz");
		}
	}

}
