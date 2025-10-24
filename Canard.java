public abstract class Canard {
	ComportementVol comportementVol;
	ComportementCancan comportementCancan;


	public Canard() {
	}
	
	public abstract void afficher();
	
	public void effectuerVol() {
		comportementVol.voler();
	}
	
	public void effectuerCancan() {
		comportementCancan.cancaner();
	}
	
	void nager() {
		System.out.println("Le canard nage!");
	}
	
	//si on veut modifier le comportement d'un canard à la volée
	public void setComportementVol(ComportementVol cv) {
		comportementVol = cv;
	}
	public void setComportementCancan(ComportementCancan cc) {
		comportementCancan = cc;
	}

}



