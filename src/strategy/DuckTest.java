package strategy;

public class DuckTest {
	public static void main(String[] args) {
		Duck duck = new ToyDuck();
		duck.fly();
		duck.quack();
		duck.setFlyBehavior(new NoFly());
		duck.fly();
	}
}
