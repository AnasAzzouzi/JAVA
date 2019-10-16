import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
		/*Map<Integer,String> map=new HashMap<Integer,String>(); 
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
			
			System.out.println(" key  = "+k+"  value = "+map.get(k));}
			*/
		
		Map<Integer,String>mp=new HashMap<Integer,String>();
		mp.put(1, "a");
		mp.put(1, "b");
		mp.put(1, "c");
		mp.put(3, "d");
		Set<Entry<Integer,String>> setEntry=mp.entrySet();
		
		Iterator EntryIterator =setEntry.iterator();
		System.out.println("parcours d une Map avec setEntry :");
		
		
		while(EntryIterator.hasNext()) {
			Entry<Integer,String> entry=(Entry<Integer,String>) EntryIterator.next();
			System.out.println(" key  = "+entry.getKey()+"  value = "+entry.getValue());
			
		}
	
		

	
		
		
		
		
	}
}
