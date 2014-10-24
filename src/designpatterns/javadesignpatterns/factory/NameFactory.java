public class NameFactory {
    // Returns an instance of LastFirst or FirstFirst depending on whether comma is found
    public Namer getNamer(String entry) {
        int i = entry.indexOf(",");
        if(i > 0) {
            return new LastFirst(entry);
        }
        return new FirstFirst(entry);
    }

    public static void main(String[] args) {
        NameFactory factory = new NameFactory();
        Namer namer1 = factory.getNamer("Jenkins, Ted");
        Namer namer2 = factory.getNamer("Ted Jenkins");

        System.out.println(namer1.getFirst());
        System.out.println(namer2.getFirst());
    }
}

