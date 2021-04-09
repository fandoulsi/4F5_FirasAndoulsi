package Black_Jack.releveScores.messages.transmettre_choisir_joueur;

import Black_Jack.releveScores.enumerations.NumeroJoueur;
import ntro.messages.MessagePourEnvoi;

public interface MsgTransmettreChoisirJoueurPourEnvoi extends MessagePourEnvoi{
	
	void setNumeroJoueur(NumeroJoueur marque);

}
