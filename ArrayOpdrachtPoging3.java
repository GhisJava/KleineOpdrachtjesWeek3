import java.util.Scanner;

//laatste poging (3)

class ArrayOpdracht {
	public static void main(String[] args) {
		System.out.println("Druk op nummer 2 of 3 en dan op enter:");

		int[] RaakMis = {0,0,0,0,0}; 
		for (int a = 0; a <= RaakMis.length; a++) {

			Scanner toetsenBord = new Scanner(System.in);
			int toetsKnop = toetsenBord.nextInt();

			if (toetsKnop == 2) {
				System.out.println("Raak!");
			} else if (toetsKnop == 3) {
				System.out.println("Mis!");
			} else if (toetsKnop != 2 && toetsKnop != 3) {
				System.out.println("Voer een 2 of een 3 in:");
			}
		}
	}
}