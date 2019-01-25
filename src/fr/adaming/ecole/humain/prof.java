package fr.adaming.ecole.humain;

public class prof extends humain {
	String diplome;
	int salaire;
	
	public prof() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructeur using field en faisant clikDt/source/generateconstructorusingfields
	public prof(String diplome, int salaire) {
		super();
		this.diplome = diplome;
		this.salaire = salaire;
	}
	

	public prof(int salaire) {
		super();
		this.salaire = salaire;
	}

	public void enseigne() {
		System.out.println("j'enseigne...");
	}

	@Override
	public String toString() {
		return "prof [diplome=" + diplome + ", salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + ", age="
				+ age + ", adresse=" + adresse + ", sex=" + sex + "]";
	}
	
	
	

}
