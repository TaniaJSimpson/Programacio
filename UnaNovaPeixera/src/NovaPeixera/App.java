package NovaPeixera;

import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int MIDAPANTALLA = 600;


	Peixera peixera;
	Random aleatori = new Random();

	public void run() {

		setSize(MIDAPANTALLA, MIDAPANTALLA);

		GRectangle pantalla = new GRectangle(0, 0, MIDAPANTALLA, MIDAPANTALLA);
		peixera = new Peixera(pantalla);

		for (int i = 0; i < 10; i++) {
			peixera.afegirPeixos(generarPeixos());
		}
		while (true) {
			peixera.mouPeixos();
			pause(100);
		}

	}

	private Peix generarPeixos() {

		
		int posx = aleatori.nextInt(MIDAPANTALLA+1);
		int posy = aleatori.nextInt(MIDAPANTALLA+1);
		int direcX = 0;
		int direcY = 0;
		int tipusPeix = aleatori.nextInt(4) + 1;
		String[] imatgeP = { "peix1.png", "peixa1.png" };
		int rand= aleatori.nextInt(2);
		GImage peixImg = new GImage(imatgeP[rand]);

		/*
		 * boolean[] sexes = { true, false }; boolean sexe =
		 * sexes[aleatori.nextInt(sexes.length)];
		 * 
		 * if (sexe == true) { peixImg = new GImage("peix1.png"); add(peixImg);
		 * } else { peixImg = new GImage("peixa1.png"); add(peixImg); }
		 * 
		 */

		switch (tipusPeix) {

		case 1:

			direcX = 1;
			direcY = 0;

			break;

		case 2:

			direcX = 0;
			direcY = 1;

			break;

		case 3:

			direcX = 0;
			direcY = -1;

			break;

		case 4:

			direcX = -1;
			direcY = 0;

			break;

		}

		add(peixImg);
		Peix fish = new Peix(peixImg, posx, posy, direcX, direcY);

		return fish;
	}

}