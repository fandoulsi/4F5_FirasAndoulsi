package Black_Jack.releveScores.commandes.choisir_joueur;

import Black_Jack.releveScores.enumerations.NumeroJoueur;
import ntro.commandes.CommandePourEnvoi;

public interface ChoisirJoueurPourEnvoi extends CommandePourEnvoi{
	
	void setNumeroJoueur(NumeroJoueur marque);
	

}
