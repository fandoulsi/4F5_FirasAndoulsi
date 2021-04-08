package Black_Jack.releveScores.page_releve_scores;

import Black_Jack.releveScores.enumerations.NumeroJoueur;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;

public class ReleveScores extends Modele<ReleveScoresLectureSeule> implements ReleveScoresLectureSeule{
	
	private NumeroJoueur numJoueur;

	@Override
	public NumeroJoueur getNumeroJoueur() {
		J.appel(this);

		return numJoueur;
	}
	
	public void choisirNumeroJoueur(NumeroJoueur choisirJoueur) {
		J.appel(this);
		
		this.numJoueur = choisirJoueur;
	}

	@Override
	public void apresChargementJson() {
		J.appel(this);
		
		DoitEtre.nonNul(numJoueur);
		
	}

	@Override
	public void apresCreation() {
		J.appel(this);

		numJoueur = NumeroJoueur.JOUEUR1;
		
	}

}
