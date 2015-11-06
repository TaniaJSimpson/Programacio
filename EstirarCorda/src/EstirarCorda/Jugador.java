package EstirarCorda;

import java.util.Random;
import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Jugador {
	
	Random aleatori = new Random();
	
	int forca;
	GImage imatge;
	
	public Jugador(GImage image){
		
		imatge=image;
		
	}
	
	//Retorna la posicio
	public GRectangle getPosicio() {
	    return imatge.getBounds();
	}
	
	
	//Retorna la força
	public int getFuerza(){
		forca=aleatori.nextInt(20);
		return forca;
	}
	
}

