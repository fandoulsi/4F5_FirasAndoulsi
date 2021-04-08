package Black_Jack.releveScores.commandes.obtenir_scores;

import Black_Jack.releveScores.enumerations.ResulatsPartiePrecedent;
import ntro.commandes.CommandePourEnvoi;

public interface ObtenirScorePourEnvoi extends CommandePourEnvoi{
	
	void setResultatsPartie(ResulatsPartiePrecedent res);

}
