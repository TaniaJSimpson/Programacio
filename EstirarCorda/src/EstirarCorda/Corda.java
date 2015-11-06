package EstirarCorda;

	import java.awt.Color;


	import acm.graphics.GRect;
	import acm.graphics.GRectangle;

	public class Corda {
		
		GRect cordaObj;
		
		public Corda(GRect corda){
			cordaObj = corda;
			cordaObj.setColor(Color.black);
		}
		
		//Retorna posicio de la corda
		public GRectangle getPosicio() {
		    return cordaObj.getBounds();
		}
		
		//Mou la corda
		public void mou(int x) {
			cordaObj.move(x * 1 , 0);
		}
		
		
	}

