package animal;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal an1= new Animal();
		 Animal an2=new Animal();
		 Animal an3= new Animal();
		 System.out.println("le nombre des animaux Créé est "+Animal.getNbrAnimal() );
		 System.out.println(an2);
		 an1.parle();
		 System.out.println(an1.getPoid());
		 Chien kb1= new Chien();
		 Chat mch1= new Chat();
		 System.out.println( kb1.getPoid());
		 System.out.println(mch1.getPoid());
	}

}
