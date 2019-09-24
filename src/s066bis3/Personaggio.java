package s066bis3;

public class Personaggio {
	private String name;
    private String clan;
    private int puntivita;
    private int combatti;
    
    public Personaggio(String name, String clan, int puntivita) {
    	this.name = name;
    	this.clan = clan;
    	this.puntivita = puntivita;
    }
    public int getPuntivita() {
    	return puntivita;
    }
//public void getCombattere() {
//	 return puntivita*
//}
}
