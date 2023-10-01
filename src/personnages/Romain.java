package personnages;

public class Romain {
	private String nom;
	private int force ;
	
	private Equipement[] equipements = new Equipement[2]; 
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force >= 0;
	}
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>"  );
	}


	public String prendreParole() {
		return "Le romain" + nom + ":";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force >= 0;   //Precondition
		int f = force ;
		
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("j'abandonne ...");
		}
		
		assert force < f ; //PostCondition

	}
	
	
    private void forceEq(Equipement equipement) {
		System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement + ".");
		equipements[nbEquipement] = equipement;
		nbEquipement++;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
			case 2:
				System.out.println("Le soldat " + getNom() + " est déjà bien protégé !");
				break;
				
			case 1:
				if(equipement == equipements[0]) 
					System.out.println("Le soldat " + getNom() + " possède déjà un " + equipement + "." );
				else 
					forceEq(equipement);
				break;
				
			default:
				forceEq(equipement);
				break;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Romain minus = new Romain("Minus", 6);
		
		
		
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
	
}
