import java.util.Scanner;

/poging 1 

public class OpVakantie {

	public static void main(String[] args) {
		Scanner invoer = new Scanner(System.in);
		String nieuwWoord = invoer.nextLine();
		
		/*while (de laatste letter van het vorige woord 
				overeenkomt met de eerste letter van het nieuwe woord, is alles ok)
      if(de laatste letter van het vorige woord 
			NIET overeenkomt met de eerste letter van het nieuwe woord) {
	System.out.println("Type een woord in dat begint met een letter waarmee het vorige woord is geëindigd:" + invoer);
} 
		//iets met String toString() doen?
		//iets met charAt(int index) ?
		//iets met CharSequence subSequence(int start, int end)?
		//iets met stringBuffer en stringBuilder?
		//iets met RegEx?
		
		
		//nieuwWoord...... verwerken in een method ofzo, zodat die variable gebruikt kan worden. 
		
		String laatsteLetter = invoer.nextLine();
		String eersteLetter = invoer.nextLine();;
		
	//	String returnValue1 = laatsteLetter.substring(???); //eerst erachter komen hoe je de lengte van elk nieuw woord checkt en dan de laatste letter ervan controleert.
	//	String returnValue2 = eersteLetter.substring(); // idem dito */
		
		System.out.println(laatsteLetter.equals(eersteLetter));
	}
}