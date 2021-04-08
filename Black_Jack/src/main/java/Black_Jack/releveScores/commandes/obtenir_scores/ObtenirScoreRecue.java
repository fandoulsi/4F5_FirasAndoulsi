package Black_Jack.releveScores.commandes.obtenir_scores;

import Black_Jack.releveScores.enumerations.ResulatsPartiePrecedent;
import ntro.commandes.CommandeRecue;

public interface ObtenirScoreRecue extends CommandeRecue{
	
	ResulatsPartiePrecedent getResultats();

}
