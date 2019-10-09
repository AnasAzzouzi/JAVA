import java.util.ArrayList;
import java.util.Iterator;
public class Solo <T>{

	private T valeur;
	public void setValeur(T val) {
		valeur=val;
	}
	
	public T getValeur() {
		return valeur;
	}
	
	public Solo(T valeur) {
		this.valeur=valeur;
	}
	public String toString() {
		return ""+this.valeur;
	}
	public static void main(String[] args) {
		Solo<Integer> s1= new Solo<Integer>(123);
		Solo<String> s2= new Solo<String>("Hello");
		Solo<Double> s3= new Solo<Double>(12358.54);
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String str=(String)it.next();
			
			if(str.equals("4")|| str.equals("2")) it.remove();
			System.out.println(str);
		}


	
		
		
		
		
	}
}
