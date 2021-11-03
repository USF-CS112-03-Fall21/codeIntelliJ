package lecture18Examples;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String>  dictionary = new HashMap<String, String>();

        dictionary.put("boredom", "The state of being bored");

        dictionary.put("university",
                "A school that offers courses leading to a degree");

        String definition = dictionary.get("university");
        System.out.println(definition);

        System.out.println(dictionary.get("school")); // not added as a key

        for (String key: dictionary.keySet()) {
            System.out.println(key + ": " + dictionary.get(key));
        }
    }

}
