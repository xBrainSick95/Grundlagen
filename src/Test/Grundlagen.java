package Test;

public class Grundlagen {

	public static void main(String[] args) {
		addierenundAusgeben(10, 20);
		subtrahieren(3, 9);
		dividieren(25, 0);

	}
	
	public static void addierenundAusgeben(int a, int b) {
		int ergebnis = a + b;
			System.out.println(ergebnis);
		
	}
	
	public static void subtrahieren(int a, int b) {
		int ergebnis = a - b;
		System.out.println(ergebnis);
		}
	
	public static void dividieren(int a, int b) {
		try {
	        int ergebnis = a / b;
	        System.out.println("Das Ergebnis der Division ist: " + ergebnis);
	    } catch (ArithmeticException e) {
	        System.out.println("Fehler: Division durch 0 ist nicht erlaubt.");
	    }
		
	}

}
