package NovaPeixera;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Peix {

	public static final int MIDAPANTALLA = 600;
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

	// Assignar el moviment (direcció-velocitat) del peix
	public void mou() {
		imatge.move(Dx * VELOCITATPEIX, Dy * VELOCITATPEIX);

	}

	public void reset() {
		if (imatge.getX() > MIDAPANTALLA) {
			imatge.setLocation(0, imatge.getY());
		} else if (imatge.getX() < 0) {
			imatge.setLocation(MIDAPANTALLA, imatge.getY());
		} else if (imatge.getY() > MIDAPANTALLA) {
			imatge.setLocation(imatge.getX(), 0);
		} else if (imatge.getY() < 0) {
			imatge.setLocation(imatge.getX(), MIDAPANTALLA);
		}
	}

	// Girar el peix
	/*private void flipHorizontal() {
		int[][] array = imatge.getPixelArray();
		int height = array.length;
		int width = array[0].length;

		for (int y = 0; y < height; y++) {
			for (int x1 = 0; x1 < width / 2; x1++) {
				int x2 = width - x1 - 1;
				int temp = array[y][x1];
				array[y][x1] = array[y][x2];
				array[y][x2] = temp;
			}
		}
		imatge.setImage(new GImage(array).getImage());
	}*/

}
