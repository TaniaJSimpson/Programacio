package EstirarCorda;


	import java.util.List;

	import acm.graphics.GRect;
	import acm.graphics.GRectangle;

	public class Camp {
		
		GRectangle midaObj;
		
		public Camp(GRectangle Mida){
			midaObj = Mida;
		}
		
		
		public void play(List<Jugador> equipEsquerre, List<Jugador> equipDreta, int EquipJugadors, GRect corda){
			
			//Coloca la corda
			corda.setLocation((midaObj.getWidth()/2)-200,(midaObj.getHeight()/2)-5);
			
			
			
			
			
		}
		
		
		
	}
	