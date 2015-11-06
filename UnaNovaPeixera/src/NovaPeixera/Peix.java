package NovaPeixera;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Peix {

	private static final int VELOCITATPEIX = 6;

	GImage imatge;
	int Dx;
	int Dy;

	public Peix(GImage image, int x, int y, int direcX, int direcY) {

		imatge = image;
		Dx = direcX;
		Dy = direcY;
		imatge.setLocation(x, y);
	}

		// Retorna la posició
	public GRectangle getPosicio() {
		return imatge.getBounds();
	}

		//Assignar el moviment (direcció-velocitat) del peix
	public void mou() {
		imatge.move(Dx * VELOCITATPEIX, Dy * VELOCITATPEIX);

	}

}
