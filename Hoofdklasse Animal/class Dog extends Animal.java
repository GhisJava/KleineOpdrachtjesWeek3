
public class Dog extends Animal {
	 
	 int age = 7;
	 int aantalNakomelingen = 3;
	 String geluid = "woef!";
	 String nakomelingen = "puppy's";
	 String naam = "Bobbie";
	
	void geluidMaken(){
		System.out.println("Mijn hond " + naam + " van " + age + " jaar oud heeft " + 
	aantalNakomelingen + " " + nakomelingen + " en zegt " + geluid);
	}
}
