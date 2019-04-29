import java.util.Scanner;

// poging 2

class ArrayOpdracht {
	public static void main(String[] args) {
		System.out.println("Druk op nummer 2 of 3 en dan op enter:");
			
//	int[] RaakMis = {0, 1, 1, 0, 0};
//			for (int a = 0; a < RaakMis.length; a++) {
		for (int a = 0; a < 50; a++) { 
			/* opdracht luidt: "zo vaak schieten als ik wil".
			 * wist niet meer of je bedoelt: zo vaak als je wil, 
			 * maar wel binnen de length van de array. */
		
			Scanner toetsenBord = new Scanner(System.in);
			String toetsKnop = toetsenBord.nextLine();
		//	int toets2 = 2;
		//	int toets3 = 3;
		
		switch (toetsKnop) {
			case "2":
				System.out.println("Raak!");
				break;
			case "3":
				System.out.println("Mis!");
				break;
		default:
				System.out.println("Foute invoer; toets een 2 of een 3 in:");				
			}
		}
	}
}
