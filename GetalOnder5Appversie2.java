import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

//poging 1 

class GetalOnder5App {

	public static void main(String[] args) {

		int[] GokNummers = { 0, 1, 2, 3, 4 };
		int[] schud = new int[5];
		for (int nrs = 0; nrs < GokNummers.length; nrs++) {
			schud[nrs] = GokNummers[nrs];
		}
		Random geschudGetal = new Random();
		for (int nrs = 0; nrs < GokNummers.length; nrs++) {
			int schdnrs = geschudGetal.nextInt(GokNummers.length);

			int nummers = schud[nrs];
			schud[nrs] = schud[schdnrs];
			schud[schdnrs] = nummers;
		}
		for (int nrs = 0; nrs < GokNummers.length; nrs++) {
			System.out.println(schud[nrs]);		
		}
		System.out.println();
		
		System.out.println("De computer heeft de getallen gehusseld. Op welk getal wil je gokken?");
		Scanner invoer = new Scanner(System.in);
		int invoerenGetal = invoer.nextInt();
		
		System.out.println("Hoeveel geld wil je inzetten op dit getal?");
		int invoerenBedrag = invoer.nextInt();
		
			if (invoerenBedrag >= 50) {
				System.out.println();
			}else {
				System.out.println("Zet 50 EURO of hoger in:");  // ik wil dat er na deze situatie opnieuw de mogelijkheis is 
																//om een correct bedrag in te voeren, maar wil niet lukken
				
			
/*	Scanner input = new Scanner());
//	int i = input.nextInt();
	
		switch (i) {
		case 1:
			System.out.println("Helaas: je bent je inzet kwijt.");
			break;

		case 2:
			System.out.println("Helaas: je bent je inzet kwijt.");
			break;

		case 3:
			System.out.println("Gefeliciteerd: je bent 100 EUR rijker!");
			break;

		case 4:
			System.out.println("Helaas: je bent je inzet kwijt.");
			break;

		case 5:
			System.out.println("Helaas: je bent je inzet kwijt.");
			break;

		default:
			System.out.println("Je hebt niet op een correct getal gegokt. Tot ziens.");
			break;*/

		}
	}
}


