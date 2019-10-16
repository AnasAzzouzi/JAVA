package gestionEleves;
import java.util.ArrayList;
import java.util.Iterator;
public class Eleve implements Comparable<Eleve> {
			private String nom;
			private ArrayList<Double> notes= new ArrayList<Double>();
			private double moyenne; 
	private void CalculerMoyenne() {
		Iterator it =this.notes.iterator();
 		double Note=0;
 		while(it.hasNext()) {
 			Note=Note+ (double)it.next();	
 		}
		moyenne=Note/notes.size();
	}				
 	public Eleve(String nom) {
		this.nom=nom;
	}
 	public double getMoyenne() {
 		CalculerMoyenne();
 		return this.moyenne;
 	}
 	public void ajouterNote(double note) {
 		
 		notes.add(note);
 		CalculerMoyenne();
 	}
 	public String getNom() {
 		return this.nom;
 	}
 	public ArrayList<Double> getListeNotes(){
 		
 		return notes;
 	}
 	public String toString() {
 		Iterator it = notes.iterator();
 		String Note="";
 		while(it.hasNext()) {
 			Note+= " - "+it.next();
 		}
 		return "Etudiant : "+ this.nom+" Notes : "+Note+" Moyenne : " +this.moyenne; 		
 	}
	@Override
	public int compareTo(Eleve o) {
		
		return  (int)this.moyenne-(int)o.moyenne;
	}
}
