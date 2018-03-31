package basic;

public class Welt {
	
	private int hoehe; 
	private int breite; 
	public int spielerZahl; 
	public Land[] countries; 
	
	public Welt(int x, int y, int spieler){
		this.hoehe = y; 
		this.breite = x; 
		spielerZahl = spieler; 
		
		initialisieren(); 
	}
	
	private void initialisieren() {
		
		
	}	
	

}
