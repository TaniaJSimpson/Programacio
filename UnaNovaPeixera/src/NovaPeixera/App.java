package NovaPeixera;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int MIDAPEIXERA=600;

	public void run(){
		Peixera peixera= new Peixera();
		
		for(int i=0; i<10; i++){
			GImage imatge= new GImage("peix1.png");
			add(imatge);
		}
		
		
	}

}
