
public class Animal {
	//int age;       
    //String soort;
	//String naam;
	//String nakomelingen;

	
	/*Uitzoeken hoe ik bovenstaande fields als standaard kan gebruiken in zo'n 'algemene'
	Animalfile en niet dubbel werk (copy-paste) in de Dog en Catfiles hoef te verrichten*/
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.geluidMaken();
		
		Cat myCat = new Cat();
		myCat.geluidMaken();
		
		System.out.println("Wat een gezellige huisdieren-boel.");
	}
	
}