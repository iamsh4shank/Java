import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
 
public class CountWords_v1 {
     
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
        String inputLine = null;
        Map dictionary = new HashMap();
        //Map dictionary = new Hashtable();
         
        while((inputLine = reader.readLine()) != null) {
            // Split the input line.
            String[] words = inputLine.split("\\s+");
             
            // Ignore empty lines.
            if(inputLine.equals(""))
                continue;
             
            for(String word: words) {
                // Remove any commas and dots.
                word = word.replace(".", "");
                word = word.replace(",", "");
                 
                if(dictionary.containsKey(word)) {
                    Integer val = dictionary.get(word);
                    dictionary.put(word, val + 1);
                }
                else
                    dictionary.put(word, 1);
            }
        }
         
        // Printing all words stored in the map.
        for(String key: dictionary.keySet())
            System.out.println(key + ": " + dictionary.get(key));
         
         
        reader.close();
    }
}
