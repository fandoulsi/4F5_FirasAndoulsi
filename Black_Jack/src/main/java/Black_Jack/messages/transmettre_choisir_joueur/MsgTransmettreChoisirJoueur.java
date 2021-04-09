package Black_Jack.messages.transmettre_choisir_joueur;

import Black_Jack.releveScores.enumerations.NumeroJoueur;
import ntro.debogage.J;
import ntro.messages.Message;

public class MsgTransmettreChoisirJoueur extends Message<MsgTransmettreChoisirJoueurPourEnvoi,
														MsgTransmettreChoisirJoueurRecu>
										implements MsgTransmettreChoisirJoueurPourEnvoi,
												   MsgTransmettreChoisirJoueurRecu {
	
	private NumeroJoueur quelleJoueur; 
	
	@Override
	public NumeroJoueur getQuelleJoueur() {
		J.appel(this);
		
		return quelleJoueur;
	}

	@Override
	public void setNumeroJoueur(NumeroJoueur quelleJoueur) {
		J.appel(this);
		
		this.quelleJoueur = quelleJoueur;
		
	}

}
