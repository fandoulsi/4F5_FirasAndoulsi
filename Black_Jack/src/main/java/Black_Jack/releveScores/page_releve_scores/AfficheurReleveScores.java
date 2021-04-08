package Black_Jack.releveScores.page_releve_scores;

import ntro.debogage.J;
import ntro.mvc.Afficheur;

public class AfficheurReleveScores extends Afficheur<ReleveScoresLectureSeule, VueReleveScores> {

	@Override
	public void initialiserAffichage(ReleveScoresLectureSeule modeleLectureSeule, VueReleveScores vue) {
		J.appel(this);
		
	}

	@Override
	public void rafraichirAffichage(ReleveScoresLectureSeule modeleLectureSeule, VueReleveScores vue) {
		J.appel(this);

		vue.afficherNumeroJoueur(modeleLectureSeule.getNumeroJoueur());
		
	}

}
