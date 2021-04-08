package Black_Jack.releveScores.page_releve_scores;

import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.messages.FabriqueMessage;
import ntro.mvc.controleurs.ControleurModeleVue;
import ntro.mvc.controleurs.RecepteurCommandeMVC;
import ntro.mvc.controleurs.RecepteurMessageMVC;
import Black_Jack.releveScores.commandes.choisir_joueur.ChoisirJoueur;
import Black_Jack.releveScores.commandes.choisir_joueur.ChoisirJoueurRecue;
import Black_Jack.releveScores.enumerations.NumeroJoueur;

public class ControleurReleveScores extends ControleurModeleVue<ReleveScoresLectureSeule, 
ReleveScores,
VueReleveScores,
AfficheurReleveScores> {

	@Override
	protected void demarrer() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(ChoisirJoueur.class, new RecepteurCommandeMVC<ChoisirJoueurRecue>() {
			@Override
			public void executerCommandeMVC(ChoisirJoueurRecue commande) {
				J.appel(this);
				
				NumeroJoueur choisirJoueur = commande.getNumeroJoueur();

				DoitEtre.nonNul(choisirJoueur);

				getModele().choisirNumeroJoueur(choisirJoueur);
			}
		});
		
	}

	@Override
	protected void installerReceptionMessages() {
		J.appel(this);
		
	}

	@Override
	protected void obtenirMessagesPourEnvoi() {
		J.appel(this);
		
	}

}
