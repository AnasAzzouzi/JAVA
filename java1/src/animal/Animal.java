package animal;

public class Animal {
	private static int nbrAnimal=0;
	private String nom;
	private int age;
	private int poid;
	private double speed;
	private int id;
	public static int getNbrAnimal() { return nbrAnimal;}
	
	public Animal() {
		this.nbrAnimal++;
		
	}
}
