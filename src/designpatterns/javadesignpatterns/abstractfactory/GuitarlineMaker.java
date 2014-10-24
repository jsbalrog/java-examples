public class GuitarlineMaker {
    private Guitarline guitarline;

    public Guitarline getGuitarline(String type) {
        guitarline = new AcousticGuitarline(); // Default type
        if(type.equals("Electric")) {
            guitarline = new ElectricGuitarline();
        }
        return guitarline;
    }

    public static void main(String[] args) {
        GuitarlineMaker guitarlineMaker = new GuitarlineMaker();
        Guitarline gl1 = guitarlineMaker.getGuitarline("Electric");
		Guitarline gl2 = guitarlineMaker.getGuitarline("Acoustic");
        Guitar guitar1 = gl1.getSixString();
        Guitar guitar2 = gl1.getTwelveString();
		Guitar guitar3 = gl2.getSixString();
        System.out.println(guitar1.getName());
        System.out.println(guitar2.getName());
		System.out.println(guitar3.getName());
    }
}

