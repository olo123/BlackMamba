package basic;
import java.util.*;
import graphic.Tile; 

public class Welt {
	
	private int hoehe; 
	private int breite; 
	public int spielerZahl; 
	public ArrayList<Spieler> spielerListe = new ArrayList<>(); 
	public Land[] countries;
	public Tile[][] tileMap; 
	
	public Welt(int x, int y, int spieler){
		this.hoehe = y; 
		this.breite = x; 
		tileMap = new Tile[y][x];
		spielerZahl = spieler; 
		 
	}	
		
	
}
