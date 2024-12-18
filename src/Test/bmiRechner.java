package Test;


import java.util.Scanner;


public class bmiRechner {
	public static void main(String[] args) {
		Scanner Obj= new Scanner(System.in);
		System.out.println("Gib bitte dein Gewicht in KG ein!");
		double kilogramm = Obj.nextDouble();
		System.out.println("Gib bitte deine Größe in Meter ein!");
		double größe = Obj.nextDouble();
		bmi(kilogramm,größe);
		
		
		
		
	}
	
	
	
	public static void bmi(double kg, double m) {
		double ergebnis = kg/(m*m);
		System.out.println("Dein BMI beträgt " + ergebnis);
		}

}
