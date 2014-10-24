/**
 * class DuckSim
 * @author Me
 */
public class DuckSim {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubberDucky = new RubberDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        rubberDucky.display();
        rubberDucky.performFly();
        rubberDucky.performQuack();
    }
}

