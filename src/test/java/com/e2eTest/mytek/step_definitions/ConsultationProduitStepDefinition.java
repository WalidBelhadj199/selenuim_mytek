package com.e2eTest.mytek.step_definitions;

import com.e2eTest.mytek.page_objects.ConsultationProduitPage;
import com.e2eTest.mytek.utils.ConfigFileReader;
import com.e2eTest.mytek.utils.SeleniumUtils;
import com.e2eTest.mytek.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.e2eTest.mytek.page_objects.ConsultationProduitPage;

public class ConsultationProduitStepDefinition {

	
	private ConsultationProduitPage consultationProduitPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;

	public ConsultationProduitStepDefinition() {
		consultationProduitPage = new ConsultationProduitPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	
	

	@Given("Je me connecte sur Mytek")
	public void jeMeConnecteSurMytek() {
		seleniumUtils.get(configFileReader.getProperty("home.url"));
		
	}
	@When("Je mets la souris sur le champs Tous nos rayons")
	public void jeMetsLaSourisSurLeChampsTousNosRayons() {
		seleniumUtils.mouseHover(consultationProduitPage.getTousNosRayons());
	}
	@When("je clique sur informatique")
	public void jeCliqueSurInformatique() {
		seleniumUtils.click(consultationProduitPage.getOptionInformatique());
	}
	@When("je clique sur Mac")
	public void jeCliqueSurMac() {
		seleniumUtils.click(consultationProduitPage.getChoixMac());

	}
	@Then("Je me redirige vers page resultat de recherche et {string} s affiche")
	public void jeMeRedirigeVersPageResultatDeRechercheEtSAffiche(String string) {
		validations.assertEquals(consultationProduitPage.getVerifAffichage(), string);
	}

	@When("je clique sur APPLE MacBook Air M1 8Go 256Go SSD - Gris")
	public void jeCliqueSurAPPLEMacBookAirM18Go256GoSSDGris() {
		seleniumUtils.click(consultationProduitPage.getRefMac());
	}
	@When("je clique sur Ajouter au pannier")
	public void jeCliqueSurAjouterAuPannier() {
		seleniumUtils.click(consultationProduitPage.getbtnAjouterPannier());

	}
	@When("Je consulte le pannier")
	public void jeConsulteLePannier() {
		seleniumUtils.click(consultationProduitPage.getPannier());
	}
	@When("je clique sur Afficher et  modifer le panier")
	public void jeCliqueSurAfficherEtModiferLePanier() {
		seleniumUtils.click(consultationProduitPage.getModifPannier());
		
	}
	

	@When("je Modifié la qté par {string}")
	public void jeModifiéLaQtéPar(String qt) {
		seleniumUtils.writeText(consultationProduitPage.getModifQté(), qt);	}

	@When("je clique sur mettre a jour le pannier")
	public void jeCliqueSurMettreAJourLePannier() {
	    
	}
	@When("Je clique sur supprimer")
	public void jeCliqueSurSupprimer() {
		seleniumUtils.click(consultationProduitPage.getbtnSupprimer());
	}
	@When("Je clique sur ok")
	public void jeCliqueSurOk() {
		seleniumUtils.click(consultationProduitPage.getConfirmSupp());
	}
	@Then("un message {string} s affiche")
	public void unMessageSAffiche(String string) {
		validations.assertEquals(consultationProduitPage.getVerifPannierVide(), string);
	}




	
	
	
	
	
	
	
	
	
	
	
}
