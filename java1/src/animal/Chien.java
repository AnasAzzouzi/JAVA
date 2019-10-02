package animal;

public class Chien extends Animal{
	public void parle() {
		System.out.println("whoof");
	}
	public int setPoid() {
		return (int)(Math.random()*40+1);

}
}