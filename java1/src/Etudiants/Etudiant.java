package Etudiants;

public class Etudiant {
private String nom;

	public Etudiant(String nom) {
	
	this.nom=nom;
	
	}
	public void Travailler() {
		
		System.out.println(this.nom+" travaille bien");
	}
	
	public void SeRepose() {
		System.out.println(this.nom+" se Repose");

	}

}
