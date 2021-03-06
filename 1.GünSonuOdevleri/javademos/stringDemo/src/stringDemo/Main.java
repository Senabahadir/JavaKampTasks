package stringDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bug?n hava ?ok g?zel.";
		System.out.println(mesaj);
		
		/*   
		 *  Java Dersi 17: Stringlerle ?al??mak 1
		System.out.println("Eleman say?s? : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));    // String i?erisindeki de?eri yazd?rma. 
		System.out.println(mesaj.concat("Ya?as?n"));             // String sonuna string ekleme 
		System.out.println(mesaj);
		
		System.out.println(mesaj.startsWith("b"));      //String, A de?eri ile ba?l?yor mu (output = boolean) b?y?k k???k harf duyarl?
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);    //5. eleman dahil de?il.
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));   //yazd???m?z karakterin ka??nc? eleman oldu?unu verir. (ilk a'ya bakar sonras?na bakmaz.) 
		System.out.println(mesaj.lastIndexOf("a"));   // ayn? i?lem ama sa?dan ba?lar.
		
		*/
		
		// Java Dersi 18 : Stringlerle ?al??mak 2
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));  // 2.indeksten sonraki mesaj (2 dahil)
		System.out.println(mesaj.substring(2,5));  // 2-4 aras?nda kalan k?s?m. (2 dahil, 5 dahil de?il.)
		
		for (String kelime: mesaj.split(" ")) {  // " " -> bo?luk olan yerleri par?ala
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());  // toLowerCase --> t?m harfleri k???k harfe ?evirir
		System.out.println(mesaj.toUpperCase());  // toUpperCase --> t?m harfleri b?y?k harfe ?evirir
		
		String mesaj2 = "   Bug?n hava ?ok g?zel.";
		System.out.println(mesaj2);
		System.out.println(mesaj2.trim()); // mesaj?n ba??nda ve sonunda bo?lukla var is onu kald?r?r.
	}

}
