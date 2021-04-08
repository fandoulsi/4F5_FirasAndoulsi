package Black_Jack.releveScores.commandes.obtenir_scores;


import Black_Jack.releveScores.enumerations.ResulatsPartiePrecedent;
import ntro.commandes.Commande;
import ntro.debogage.J;

public class ObtenirScore  extends Commande<ObtenirScorePourEnvoi, ObtenirScoreRecue> 
						implements ObtenirScorePourEnvoi, ObtenirScoreRecue {
	
	private ResulatsPartiePrecedent resultatsPartie;

	@Override
	public ResulatsPartiePrecedent getResultats() {
	J.appel(this);
		
		return resultatsPartie;
	}

	@Override
	public void setResultatsPartie(ResulatsPartiePrecedent res) {
		J.appel(this);
		
		this.resultatsPartie = res;
		
	}



}
