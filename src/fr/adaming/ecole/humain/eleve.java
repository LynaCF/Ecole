package fr.adaming.ecole.humain;

public class eleve extends humain {
	String classe;
	int niveaux;
	
	
	public eleve() {
		super();
		// TODO Auto-generated constructor stub
	}


	public eleve(String classe, int niveaux) {
		super();
		this.classe = classe;
		this.niveaux = niveaux;
	}


	public void apprendre () {
		System.out.println("j'apprends");
		
	}

}
