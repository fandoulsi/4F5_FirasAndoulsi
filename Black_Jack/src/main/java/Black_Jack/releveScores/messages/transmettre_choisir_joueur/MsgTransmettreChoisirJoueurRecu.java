package Black_Jack.releveScores.messages.transmettre_choisir_joueur;

import Black_Jack.releveScores.enumerations.NumeroJoueur;
import ntro.messages.MessageRecu;

public interface MsgTransmettreChoisirJoueurRecu extends MessageRecu{
	
	NumeroJoueur getNumeroJoueur();

}
