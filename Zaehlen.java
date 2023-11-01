import java.util.Scanner;
public class Zaehlen {
	
	public static String wortEinlesen(Scanner console) {
		System.out.print("Bitte Wort eingeben: ");
		String wort = console.next();
		return wort;
	}
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String wort = wortEinlesen(console);
		
		int anzahlBuchstaben = 0;
		int anzahlZiffern = 0;
		
		for (int i = 0; i < wort.length(); i++) {
			char c = wort.charAt(i);
			if (Character.isLetter(c)) {
				anzahlBuchstaben++;
			} 	else if (Character.isDigit(c)) {
						anzahlZiffern++;
				}
		}
		
		System.out.println(anzahlBuchstaben + " Buchstaben!");
		System.out.println(anzahlZiffern + " Ziffern");
		
		
		if (anzahlBuchstaben > anzahlZiffern){
			System.out.println("Mehr Buchstaben!");
		}
		if (anzahlBuchstaben < anzahlZiffern){
			System.out.println("Mehr Ziffern!");
		}	
		if (anzahlBuchstaben == anzahlZiffern) {
			System.out.println("Die Anzahl der Buchstaben und der Ziffern ist gleich.");
		}
	}

}
