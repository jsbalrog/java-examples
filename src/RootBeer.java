public class RootBeer {

    public static void main(String[] args) {
        String word = " bottles";

        for(int i = 99; i > 0; i--) {
            System.out.println(i + word + " of rootbeer on the wall.");
            System.out.println(i + word + " of rootbeer.");
            System.out.println("Take one down, pass it around.");

            if(i-1 > 0) {
                if(i - 1 == 1) word = " bottle";
                System.out.println(i-1 + word + " of rootbeer on the wall.\n");
            } else {
                System.out.println("No more bottles of rootbeer on the wall.");
            }
        }
    }
}

