class StaticSuper {

    // This runs before the constructor
    static {
        System.out.println("super static block");
    }

    StaticSuper() {
        System.out.println("super constructor");
    }
}

public class StaticTests extends StaticSuper {
    static int rand;

    // This runs before the constructor
    static {
        rand = (int)(Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in Main");
        StaticTests st = new StaticTests();
    }
}
