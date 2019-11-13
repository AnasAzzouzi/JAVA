package InputOutput;

import java.io.Serializable;

public class Game implements Serializable{
	private String nom,style;
	private double prix;
	private transient Player player;
	
	public Game(String nom, String style, double prix ,Player p) {
		this.nom=nom;
		this.style=style;
		this.prix=prix;
		this.player=p;
	}

	@Override
	public String toString() {
		return "Nom du Jeu : " + nom + "\n Style=" + style + "\n Prix=" + prix + "\n Joueur: "+player+"\n";
	}
	

}
