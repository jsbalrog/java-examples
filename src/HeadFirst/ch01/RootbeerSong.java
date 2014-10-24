public class RootbeerSong {

    public static void main(String[] args) {
        int rootbeernum = 99;
        String word = " bottles";

        while(rootbeernum > 0) {
            System.out.println(rootbeernum + word + " of rootbeer on the wall.");
            System.out.println(rootbeernum + word + " of rootbeer.");
            System.out.println("Take one down, pass it around.");

            rootbeernum = rootbeernum - 1;

            if(rootbeernum > 0) {
               if(rootbeernum == 1) word = " bottle";
               System.out.println(rootbeernum + word + " of rootbeer on the wall.\n");
            } else {
                System.out.println("No more bottles of rootbeer on the wall.");
            }
        }
    }
}

