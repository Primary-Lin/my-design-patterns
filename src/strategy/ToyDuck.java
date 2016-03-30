package strategy;

public class ToyDuck extends Duck {
	
	public ToyDuck() {
		flyBehavior = new FlyWithWing();
		quackBehavior = new QuietQuack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
