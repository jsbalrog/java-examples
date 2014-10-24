/**
 * class Duck
 * @author Me
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.makeSound();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
}

