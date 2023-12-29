package composition;

public class Maruti800 extends Car {

	public void marutiDemo() {
		
		Engine engine = new Engine();
		engine.start();
		engine.start();
	}
}
