package package22_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer,String > myMap(){

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, Dev, 1453");
        sinifList.put(102,"Veli, Yan, QA, 2009");
        sinifList.put(103,"Ali, Yan, C#, 1987");
        sinifList.put(104,"Mehmet, Kan, C#, 1987");
        sinifList.put(105,"Seher, Yeli, Java, 1987");

        return sinifList;


    }
}
