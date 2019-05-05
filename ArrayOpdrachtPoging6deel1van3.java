package Extra.opdrachtjes.Array;
import java.util.Scanner;
import java.util.*;

class ArrayOpdracht {
	public static void main(String[] args) {
		System.out.println("Breng de boot tot zinken!");
		GameHelper helper = new GameHelper();
		MisRaak spelletje = new MisRaak();
		
		int[] locatiePositie = {0, 1, 1, 0, 0,};
		spelletje.setLocatieCellen(locatiePositie);
		
		
		Scanner toetsenBord = new Scanner(System.in);
		int toetsKnop = toetsenBord.nextInt();
		
		
		boolean doorgaan = true;
		String deGok = "2";
		String resultaat= spelletje.controlen(deGok);
		if(resultaat.equals("raak")) {
		}
			System.out.println(resultaat);
			
			
		//for (int a = 0;; a++) {
			
//		boolean toetsKnopC = false;
//			if (toetsKnopC) {
//				System.out.println("Je mag alleen getallen invoeren:");
//			}
//			
//			if (toetsKnop == 1 || toetsKnop == 2) {
//				System.out.println("Raak!");
//
//			} else
//				System.out.println("Mis!");
//		}
	}
  }



