package com.e2eTest.mytek.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.mytek.utils.BasePage;
import com.e2eTest.mytek.utils.Setup;

public class ConsultationProduitPage extends BasePage {
	
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='TOUS NOS RAYONS']")
	private static WebElement champsTousNosRayons;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='INFORMATIQUE']")
	private static WebElement optionInformatique;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Mac']")
	private static WebElement choixMac;
	@FindBy(how = How.XPATH, using = "//span[@class='base']")
	private static WebElement affichageMac;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='APPLE MacBook Air M1 8Go 256Go SSD - Gris']")
	private static WebElement refPcMac;
	@FindBy(how = How.XPATH, using = "//button[@id='product-addtocart-button']")
	private static WebElement btnAjouterPannier;
	@FindBy(how = How.XPATH, using = "//a[@class='action showcart']")
	private static WebElement btnPannier;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Afficher et modifier le panier']")
	private static WebElement affichModiffPannier;
	@FindBy(how = How.XPATH, using = "//input[@id='cart-2765310-qty']")
	private static WebElement champsQté;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Mettre à jour son panier']")
	private static WebElement btnMettreAjourPannier;
	@FindBy(how = How.XPATH, using = "//a[@class='action delete']")
	private static WebElement btnSupprimer;
	@FindBy(how = How.XPATH, using = "//button[@class='action-primary action-accept']")
	private static WebElement btnConfirmSupprimer;
	@FindBy(how = How.XPATH, using = "//strong[@class='subtitle empty']")
	private static WebElement champVerifPannier;
	

	//strong[@class='subtitle empty']
	
	public ConsultationProduitPage() {
		super(Setup.getDriver());
	}

	
	
	public static WebElement getTousNosRayons() {
	wait.waitForElementToBeVisible(champsTousNosRayons, 10);
		return champsTousNosRayons;
		
	}
	public static WebElement getOptionInformatique() {
		wait.waitForElementToBeVisible(optionInformatique, 10);
			return optionInformatique;
			
		}
	public static WebElement getChoixMac() {
		wait.waitForElementToBeVisible(choixMac, 10);
			return choixMac;
			
		}
	public static WebElement getVerifAffichage() {
		wait.waitForElementToBeVisible(affichageMac, 10);
			return affichageMac;
			
		}
	public static WebElement getRefMac() {
		wait.waitForElementToBeVisible(refPcMac, 10);
			return refPcMac;
			
		}
	public static WebElement getbtnAjouterPannier() {
		wait.waitForElementToBeVisible(btnAjouterPannier, 10);
			return btnAjouterPannier;
			
		}
	public static WebElement getPannier() {
		wait.waitForElementToBeVisible(btnPannier, 10);
			return btnPannier;
			
		}
	public static WebElement getModifPannier() {
		wait.waitForElementToBeVisible(affichModiffPannier, 10);
			return affichModiffPannier;
			
		}
	public static WebElement getModifQté() {
		wait.waitForElementToBeVisible(champsQté, 10);
			return champsQté;
			
		}
	public static WebElement getMiseJour() {
		wait.waitForElementToBeVisible(btnMettreAjourPannier, 10);
			return btnMettreAjourPannier;
			
		}
	public static WebElement getbtnSupprimer() {
		wait.waitForElementToBeVisible(btnSupprimer, 10);
			return btnSupprimer;
			
		}
	public static WebElement getConfirmSupp() {
		wait.waitForElementToBeVisible(btnConfirmSupprimer, 10);
			return btnConfirmSupprimer;
			
		}
	public static WebElement getVerifPannierVide() {
		wait.waitForElementToBeVisible(champVerifPannier, 10);
			return champVerifPannier;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
