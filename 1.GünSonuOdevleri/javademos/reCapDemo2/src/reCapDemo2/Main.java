package reCapDemo2;

public class Main {
	public static void main(String[] args) {
		
		double[] myList = {1.1, 1.3, 4.3, 5.6};    // new yazmaya gerek yok. arka planda new oluyor..
		// Gerisini yazmad�m. 15. Video
		
		
		String[][] sehirler = new String[3][3];  //�ok boyutlu dizi
		
		sehirler[0][0] = "sena";
		sehirler[0][1] = "sena2";
		sehirler[0][2] = "sena3";
		sehirler[1][0] = "sena4";
		sehirler[1][1] = "sena5";
		sehirler[1][2] = "sena6";
		sehirler[2][0] = "sena7";
		sehirler[2][1] = "sena8";
		sehirler[2][2] = "sena9";
		
		for (int i=0; i<=
				2; i++) {
			System.out.println("----------------");
			for (int j=0; j<3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}   

}
