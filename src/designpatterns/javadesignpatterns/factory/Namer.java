public class Namer {
    protected String last;
    protected String first;

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}

class FirstFirst extends Namer {

    public FirstFirst(String s) {
        int i = s.lastIndexOf(" ");
        if(i > 0) {
            first = s.substring(0, i).trim();
            last = s.substring(i+1).trim();
        } else {
            // Put all in last name if no space
            first = "";
            last = s;
        }
    }
}

class LastFirst extends Namer {

    public LastFirst(String s) {
        int i = s.indexOf(",");
        if(i > 0) {
            last = s.substring(0, i).trim();
            first = s.substring(i+1).trim();
        } else {
            // Put all in last name if no comma
            last = s;
            first = "";
        }
    }
}

