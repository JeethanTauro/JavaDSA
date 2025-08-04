package HashMaps;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class Learning {
    public static void main(String[] args) {
        //<Country , population>
        HashMap<String, Integer> map = new HashMap();
        map.put("India", 20);
        map.put("China", 30);
        map.put("UAE", 10);
        map.put("Russia", 25);

        //getting specific value
        System.out.println(map.get("India")); //20;

        //getting all values
        System.out.println(map.values()); //[30,20,10,25] can give in any order

        for(String key : map.keySet()){
            System.out.println("Key : "+key+" Value : "+map.get(key));
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey()+"Value : "+entry.getValue());
        }
        map.forEach((key,val)->{
            System.out.println(key+" : "+val);
        });

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            if(entry.getValue() < 30){
                iterator.remove();
            }
        }
        map.forEach((key,val)->{
            System.out.println(key+" : "+val);
        });

    }
}
