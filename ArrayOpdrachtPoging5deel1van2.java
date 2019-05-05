package Extra.opdrachtjes.Array;
import java.util.Scanner;
import java.util.*;

class ArrayOpdracht {
	public static void main(String[] args) {
		System.out.println("Breng de boot tot zinken!");
		
		MisRaak spelletje = new MisRaak();
		
		int[] locatiePositie = {0, 1, 1, 0, 0,};
		spelletje.setLocatieCellen(locatiePositie);
		
		int locatieCellen;
		for (int cel : locatieCellen) {
			if (gok == cel) {
				resultaat = "raak";
				aantalRaak++;
				break;
			}
		}if (aantalRaak = locatieCellen.length) {
              resultaat = "gezonken";
          } 	
	System.out.println(resultaat);	
	return resultaat;
		
		
		String deGok = "3";
		String resulaat= spelletje.controlen(deGok);
		String testResulaat = "fout";
		if(resulaat.equals("raak")) {
			testResulaat = "goed";
		}
			System.out.println(testResulaat);
			
			
		for (int a = 0;; a++) {

			Scanner toetsenBord = new Scanner(System.in);
			int toetsKnop = toetsenBord.nextInt();
//	
//		
//			boolean toetsKnopC = false;
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
	
}

 