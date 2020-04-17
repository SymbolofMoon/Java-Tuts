import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Mapppppp{
    public static void main(String ... args){

        long start = System.currentTimeMillis();
        Map <String, String>map = new HashMap<>();

        map.put("Country","India");
        map.put("Animal","Tiger");
        map.put("Bird","Peacock");
        map.put("Flower","Lotus");

      // System.out.print(map.get(map.keySet()));
        Set <String> keys = map.keySet(); 

        for (String key: keys){
            System.out.println(key+" : "+map.get(key));
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}