package jsonobjectexample;

import net.sf.json.JSONObject;

/**
 *
 * @author jenkinset
 */
public class FirstJSONJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
		object.put("name", "Ted Jenkins");
		object.put("max.score", new Integer(100));
		object.put("min.score", new Integer(82));
		object.put("age", new Integer(43));
		System.out.println(object);
    }

}
