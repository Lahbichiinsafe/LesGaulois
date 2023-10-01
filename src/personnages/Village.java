package personnages;



public class Village {

	private String nom;
	private Chef chef;
	private int nbVillageois;
	private Gaulois[] villageois;
	

	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	

	
	public String getNom() { return nom; }
	

	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	

	
	public void ajouterHabitant(Gaulois gaulois) {
		if(nbVillageois < villageois.length) {
			villageois[nbVillageois] =  gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numVillageois) {

		return villageois[numVillageois];
	}
	
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef " + chef.getNom() + "vivent les légendaires gaulois :");
		for(int i = 0; i < nbVillageois; ++i) {
			Gaulois gaulois = villageois[i];
				System.out.println(" - " + gaulois.getNom());
		}
	}
	
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
        Chef chef = new Chef("Abraracourcix", 6,  village);
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		
		
		
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		
		
		
	}
	
}
	
