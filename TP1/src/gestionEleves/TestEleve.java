package gestionEleves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEleve {

	public static void main(String[] args) {
	Eleve e1= new Eleve("Ahmed");
	e1.ajouterNote(12.25);
	e1.ajouterNote(15.5);
	e1.ajouterNote(9);
	Eleve e2= new Eleve("Amine");
	e2.ajouterNote(15);
	e2.ajouterNote(15.5);
	e2.ajouterNote(17);
	Eleve e3= new Eleve("Moustafa");
	e3.ajouterNote(5);
	e3.ajouterNote(17);
	e3.ajouterNote(13.5);
	GroupeEleves Gp= new GroupeEleves();
	Gp.ajouterEleve(e1);
	Gp.ajouterEleve(e2);
	Gp.ajouterEleve(e3);
	//System.out.println(e1);
	/*
	System.out.println("Recherche d'un eleve :");
	System.out.println(Gp.chercher("Amine"));
	System.out.println("Liste des eleves:");
	Gp.lister();*/
	
	ArrayList<Eleve> le=new ArrayList<Eleve> ();
	le.add(e1);
	le.add(e2);
	le.add(e3);
	System.out.println("Avant le tri");
	Iterator it = le.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Collections.sort(le);
	Iterator it2 = le.iterator();
	System.out.println("Apres le tri");
	while(it2.hasNext()) {
		System.out.println(it2.next());
	}
	

	}

}
