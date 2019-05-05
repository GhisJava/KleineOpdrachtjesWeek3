package Extra.opdrachtjes.Array;

class MisRaak {
	int[] locatieCellen;
	int aantalRaak;

	public void setLocatieCellen(int[] locPos) {
		locatieCellen = locPos;
	}

	public String controlen(String deGok) {
		int gok = Integer.parseInt(deGok);
		String resultaat = "raak";
		for (int cel : locatieCellen) {
			if (gok == cel) {
				resultaat = "raak";
				aantalRaak++;
				break;
			}
		}
		if (aantalRaak == locatieCellen.length) {
			resultaat = "gezonken";
		}
		System.out.println(resultaat);
		return resultaat;

	}
}
