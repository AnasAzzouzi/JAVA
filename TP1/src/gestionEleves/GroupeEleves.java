package gestionEleves;
import java.util.ArrayList;
import java.util.Iterator;

public class GroupeEleves {
	private ArrayList<Eleve> ListEleves= new ArrayList<Eleve>();
	public int nombre() {
		return this.ListEleves.size();
		
	}
	public ArrayList<Eleve>  getList(){
		
		return this.ListEleves;
	}
	public void ajouterEleve(Eleve e) {
		ListEleves.add(e);
	}
	public Eleve chercher (String nom) {
		Eleve e1=null;
		Iterator it = ListEleves.iterator();
		
		while(it.hasNext()) {
		Eleve e=(Eleve)it.next();
		String name=e.getNom();
		if( name==nom) {
			e1=e;
		}
		}
		return e1;
		
	}
	public void lister() {
		Iterator it = ListEleves.iterator();
		while(it.hasNext()) {
			Eleve e=(Eleve)it.next();
			System.out.println(e);
			
		}
	}

}
