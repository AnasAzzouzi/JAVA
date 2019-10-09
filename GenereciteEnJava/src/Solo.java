import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
		/*Solo<Integer> s1= new Solo<Integer>(123);
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
			/*String str=(String)it.next();
			if(str.equals("4")|| str.equals("2"))
			it.next();
			it.remove();
			
			System.out.println("removed");
		}
		System.out.println(list);*/
		Map<Integer,String> map=new HashMap<Integer,String>(); 
		map.put(1, "un");
		map.put(2, "deux");
		map.put(3, "trois");
		map.put(4, "quatre");
		map.put(5, "cinq");
		map.put(6, "six");
		Set keys=map.keySet();
		Iterator it= keys.iterator();
		while(it.hasNext()) {
			Integer k=(Integer)it.next();
			
			System.out.println(" key  = "+k+" value = "+map.get(k));
			
		}
		
		

	
		
		
		
		
	}
}
