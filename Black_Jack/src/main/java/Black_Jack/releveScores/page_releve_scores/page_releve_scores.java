package Black_Jack.releveScores.page_releve_scores;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import ntro.debogage.DoitEtre;
import ntro.debogage.Erreur;
import ntro.debogage.J;
import ntro.javafx.ChargeurDeVue;
import ntro.javafx.Initialisateur;
import ntro.mvc.controleurs.FabriqueControleur;
import ntro.mvc.modeles.EntrepotDeModeles;
import ntro.systeme.Systeme;

import static Black_Jack.releveScores.BlackJack.Constantes.*;

import java.net.URI;
import java.net.URISyntaxException;


public class page_releve_scores extends Application {
	
	static {

		Initialisateur.initialiser();
		
		J.appel(page_releve_scores.class);
	}
	
	public static void main(String[] args) {
		J.appel(page_releve_scores.class);
		launch(args);
	}

	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		ChargeurDeVue<VueReleveScores> chargeur;
		chargeur = new ChargeurDeVue<VueReleveScores>(CHEMIN_RELEVESCORES_FXML);

		VueReleveScores vue = chargeur.getVue();
		
		ReleveScores releveScores = EntrepotDeModeles.creerModele(ReleveScores.class, ID_MODELE_PAR_DEFAUT);
		
		AfficheurReleveScores afficheurReleveScores = new AfficheurReleveScores();
		
		DoitEtre.nonNul(vue);

		FabriqueControleur.creerControleur(ControleurReleveScores.class, releveScores, vue, afficheurReleveScores);

		Scene scene = chargeur.nouvelleScene(LARGEUR_PIXELS, HAUTEUR_PIXELS);

		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.setMinWidth(LARGEUR_PIXELS);
		fenetrePrincipale.setMinHeight(HAUTEUR_PIXELS);
		
		capterEvenementFermeture(fenetrePrincipale);

		fenetrePrincipale.show();
	}

	private void capterEvenementFermeture(Stage fenetrePrincipale) {
		J.appel(this);

		fenetrePrincipale.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				J.appel(this);

				Systeme.quitter();
			}
		});
	}
		
}
