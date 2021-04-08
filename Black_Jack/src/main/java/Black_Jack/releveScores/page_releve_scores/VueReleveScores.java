package Black_Jack.releveScores.page_releve_scores;

import java.net.URL;
import java.util.ResourceBundle;

import ntro.commandes.FabriqueCommande;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.Vue;
import ntro.systeme.Systeme;
import Black_Jack.releveScores.commandes.choisir_joueur.ChoisirJoueur;
import Black_Jack.releveScores.commandes.choisir_joueur.ChoisirJoueurPourEnvoi;
import Black_Jack.releveScores.commandes.fermer_releveScores.FermerReleveScores;
import Black_Jack.releveScores.commandes.fermer_releveScores.FermerReleveScoresPourEnvoi;
import Black_Jack.releveScores.commandes.obtenir_scores.ObtenirScore;
import Black_Jack.releveScores.commandes.obtenir_scores.ObtenirScorePourEnvoi;
import Black_Jack.releveScores.enumerations.NumeroJoueur;
import Black_Jack.releveScores.enumerations.ResulatsPartiePrecedent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class VueReleveScores implements Vue, Initializable{
	
	private FermerReleveScoresPourEnvoi fermerReleveScores;
	private ChoisirJoueurPourEnvoi choisirJoueur;
	private ResulatsPartiePrecedent resultats;
	
	@FXML
	private Text Joueur;
	
	@FXML
	private CheckBox checkJoueur1, checkJoueur2;
	
	@FXML
	private Button boutonTerminer;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(checkJoueur1);
		DoitEtre.nonNul(checkJoueur2);
		DoitEtre.nonNul(boutonTerminer);

		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		checkJoueur1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirJoueur.setNumeroJoueur(NumeroJoueur.JOUEUR1);
				choisirJoueur.envoyerCommande();
			}
		});
		
		checkJoueur2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				choisirJoueur.setNumeroJoueur(NumeroJoueur.JOUEUR2);
				choisirJoueur.envoyerCommande();
			}
		});

		boutonTerminer.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				Systeme.quitter();
				fermerReleveScores.envoyerCommande();
			}
		});
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		fermerReleveScores = FabriqueCommande.obtenirCommandePourEnvoi(FermerReleveScores.class);
		choisirJoueur = FabriqueCommande.obtenirCommandePourEnvoi(ChoisirJoueur.class);
		
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}
	
	public void afficherNumeroJoueur(NumeroJoueur numeroJoueur) {
		J.appel(this);
		
		DoitEtre.nonNul(numeroJoueur);

		switch(numeroJoueur) {
		
		case JOUEUR1:
			checkJoueur1.setSelected(true);
			checkJoueur2.setSelected(false);
			Joueur.setText("JOUEUR 1");
			break;

		case JOUEUR2:
			checkJoueur1.setSelected(false);
			checkJoueur2.setSelected(true);
			Joueur.setText("JOUEUR 2");
			break;
		
		}
	}

}
