import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Trie {

	public static void main(String[] args) {
		Set<String> tree = new TreeSet<String>();
		tree.add("Halima");
		tree.add("Mbarka");
		tree.add("Malika");
		tree.add("Arbi");
		tree.add("Moustafa");
		tree.add("Boujemaa");
		tree.add("El Mekki");
		tree.add("Rayan");
		Iterator<String> it=tree.iterator();
		while(it.hasNext()) System.out.println(it.next());
			

		

	}

}
