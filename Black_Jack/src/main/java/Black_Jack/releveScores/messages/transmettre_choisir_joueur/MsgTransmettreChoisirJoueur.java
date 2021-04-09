package Black_Jack.releveScores.messages.transmettre_choisir_joueur;

import Black_Jack.releveScores.enumerations.NumeroJoueur;
import ntro.commandes.Commande;
import ntro.debogage.J;
import ntro.messages.Message;

public class MsgTransmettreChoisirJoueur extends Message<MsgTransmettreChoisirJoueurPourEnvoi,
														MsgTransmettreChoisirJoueurRecu>
										implements MsgTransmettreChoisirJoueurPourEnvoi,
												   MsgTransmettreChoisirJoueurRecu {
	
	private NumeroJoueur quelleJoueur; 
	
	@Override
	public NumeroJoueur getNumeroJoueur() {
		J.appel(this);
		
		return quelleJoueur;
	}

	@Override
	public void setNumeroJoueur(NumeroJoueur marque) {
		J.appel(this);
		
		this.quelleJoueur = marque;
		
	}


}
