package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.setEffetPotionMin(effetPotionMin);
		this.setEffetPotionMax(effetPotionMax);
		parler("Bonjour, je suis la druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
		
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>") ;
		
		
	}


	private String prendreParole() {

		return "Le druide" + nom + ":";
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void setEffetPotionMin(int effetPotionMin) {
		this.effetPotionMin = effetPotionMin;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public void setEffetPotionMax(int effetPotionMax) {
		this.effetPotionMax = effetPotionMax;
	}
	
	
	public void preparerPotion() {
		Random random = new Random() ;
		this.forcePotion = random.nextInt( effetPotionMax  ) +effetPotionMin;
		if (forcePotion > effetPotionMax) {
			forcePotion = effetPotionMax;
		}
		
		
		
		if ( forcePotion > 7) {
			parler("J'ai préparé une super potion de force " + forcePotion );
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion );
			
		}
		
	  }
	
	
	public void booster(Gaulois gaulois) {
		if(gaulois.getNom().equals("Obélix"))
			 parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		else
			gaulois.boirePotion(forcePotion);

		
		
		
	}
	
	
	
	
	
	
}
