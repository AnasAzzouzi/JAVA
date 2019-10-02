package animal;

public class Animal {
	private static int nbrAnimal=0;
	private String nom;
	private int age;
	private int poid;
	private double speed;
	private int id;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}
	public int setPoid() {
	return (int)(Math.random()*60+1);
}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public static int getNbrAnimal() { return nbrAnimal;}
	
	public Animal() {
		this.nbrAnimal++;
		this.poid=setPoid();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public  void parle() {
	System.out.println("waaaaaaaaaaaaaaaaaaaaaaaa");
}
}
