package variables;

public class Main {

	public static void main(String[] args) {
		int öğrenciSayisi = 10;
		String mesaj = "Öğrenci Sayisi : ";
		System.out.println(mesaj  + öğrenciSayisi);
		System.out.println(mesaj  + öğrenciSayisi);
		System.out.println("Öğrenci Sayımı : " + öğrenciSayisi);  // her seferinde öğrenci sayısı için değişken oluşur. Bellekte gereksiz yer kaplar. Bir kere tanımlayıp başka yerlerde kullanmak daha mantıkllı.
		System.out.println("Öğrenci Sayımı : " + öğrenciSayisi);
		System.out.println("Öğrenci Sayımı : " + öğrenciSayisi);
		
		// JAVA -> String     C# -> string

	}

}

// reusability = tekrar kullanılabilirlik. 