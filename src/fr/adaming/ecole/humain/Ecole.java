package fr.adaming.ecole.humain;

public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		eleve leMeilleur = new eleve();
		eleve lePire = new eleve();
		eleve leTricheur = new eleve();
		prof leProf = new prof();
		prof leProfMath = new prof("Master Mathematiques",2500);
		prof leProfTechno = new prof(2200);
		leProfMath.adresse = "24 rue des oliviers 4150 DjerbaLaDouce";
		leProfMath.age = 29;
		leProfMath.nom = "Herbert" ;
		leProfMath.prenom = "Norbert";
		leProfMath.sex = 'H';
		
		leProfMath.enseigne();
		leMeilleur.apprendre();
		
		
		System.out.println(leProfMath.toString());
		
	}

}
