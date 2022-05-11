// Collection and Framework Generics
// Program for Map Concept

import java.util.HashMap;

class MapConcept
{
    public static void main(String...args)
    {
        HashMap map=new HashMap();
        map.put(11,"Kashish");
        map.put(12,"Kashish");
        map.put(13,"Jay");
        map.put(14,"Sanskar");
        map.put(15,"Shruti");
        map.put(16,"Bhanu");
        map.put(17,"Bhanu");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        String name="radha";
        HashMap map1=new HashMap();
        map1.put("CALL",name);

        String value = (String)map1.get("CALL");
        System.out.println(value);
    }
}
