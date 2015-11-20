package NovaPeixera;

import java.util.ArrayList;
import java.util.List;

import acm.graphics.GRectangle;

public class Peixera {

	GRectangle mida;

	List<Peix> peixera = new ArrayList<Peix>();
	List<Peix> peixets = new ArrayList<Peix>();

	public Peixera(GRectangle rectangle) {

		mida = rectangle;

	}

	public void afegirPeixos(Peix nemo) {
		peixera.add(nemo);

	}

	public void mouPeixos() {
		for (int i = 0; i < peixera.size(); i++) {
			peixera.get(i).mou();
			
			// comprovar si surten

			Peix pez = peixera.get(i);
			GRectangle posPeix = pez.getPosicio();

			if (!posPeix.intersects(mida)) {
				pez.reset();
			}

		}

	}

	public void siXoca(Peix pez) {
		// comprovar si xoquen

	}

}
