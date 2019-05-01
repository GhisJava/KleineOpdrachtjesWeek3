
public class Cat extends Animal {
	int age = 3;
	int aantalNakomelingen = 0;
	String geluid = "miauw!";
	String nakomelingen = "kittens";
	String naam = "Markies";
	
	void geluidMaken() {
		System.out.println("Onze kat heet " + naam + ", is " + age + " jaar oud, heeft " +
	aantalNakomelingen + " " + nakomelingen + " en doet " + geluid);
	}
}
