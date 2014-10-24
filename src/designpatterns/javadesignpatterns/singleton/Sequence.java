public class Sequence {
    private static Sequence instance; // To store the singleton instance class
    private static int counter;

    // Private constructor
    private Sequence () {
        counter = 0;
    }

    public static Sequence getInstance() {
        // Lazy init
        if(instance == null) {
            instance = new Sequence();
        }
        return instance;
    }

    public static int getNext() {
        return ++counter;
    }

    public static void main(String[] args) {
        Sequence sequence = Sequence.getInstance();
        System.out.println(sequence.getNext());
        Sequence notherSequence = Sequence.getInstance();
        System.out.println(notherSequence.getNext());
        System.out.println(sequence.getNext());
    }
}

