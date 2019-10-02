package exercice1;

public class AfficheArguments {

	public static void main(String[] args ) {

		if(args.length==0) {
			System.out.println("no args");
		}else {
			for(int i=0;i<args.length;i++)
				System.out.println(args[i]);
		
		}
	
	}
	
	
}

