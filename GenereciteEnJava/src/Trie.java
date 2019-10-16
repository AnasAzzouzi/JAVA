import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Trie {

	public static void main(String[] args) {
		/*Set<String> tree = new TreeSet<String>();
		tree.add("Halima");
		tree.add("Malika");
		tree.add("Malika");
		tree.add("Arbi");
		tree.add("Moustafa");
		tree.add("Boujemaa");
		tree.add("El Mekki");
		tree.add("Rayan");
		Iterator<String> it=tree.iterator();
		while(it.hasNext()) System.out.println(it.next());*/
		
		CD C =new CD("anas","test",120);
		CD C2 =new CD("zak","test2",20);
		CD C3 =new CD("zak","test2",50);
		CD C4 =new CD("zak","test2",80);

		
		ArrayList<CD> list= new ArrayList<CD>();
		list.add(C2);
		list.add(C);
		list.add(C3);
		list.add(C4);
			
		Collections.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}

		

	}

}
