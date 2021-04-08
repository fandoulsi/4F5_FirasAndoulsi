package Black_Jack.releveScores.commandes.choisir_joueur;

import Black_Jack.releveScores.enumerations.NumeroJoueur;
import ntro.commandes.Commande;
import ntro.debogage.J;

public class ChoisirJoueur extends Commande<ChoisirJoueurPourEnvoi, ChoisirJoueurRecue> 
								implements ChoisirJoueurPourEnvoi, ChoisirJoueurRecue {
	
	private NumeroJoueur numeroJoueur;

	@Override
	public void setNumeroJoueur(NumeroJoueur marque) {
		J.appel(this);
		
		this.numeroJoueur = marque;
		
	}

	@Override
	public NumeroJoueur getNumeroJoueur() {
		J.appel(this);
		
		return numeroJoueur;
	}


}
