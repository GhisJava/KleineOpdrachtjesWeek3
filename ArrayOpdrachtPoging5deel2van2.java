package Extra.opdrachtjes.Array;

class MisRaak extends ArrayOpdracht {
	int aantalRaak = 0;
	int[] locatieCellen;

	public String controlen(String deGok) {
		int gok = Integer.parseInt(deGok);
		String resultaat = "mis";
		return resultaat;
	}

	void setLocatieCellen(int[] locPos) {
		locatieCellen= locPos;
	}
}
