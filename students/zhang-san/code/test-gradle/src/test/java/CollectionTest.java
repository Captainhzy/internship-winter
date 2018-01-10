import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wyy on 18-1-10
 */
public class CollectionTest {

    @Test
    public void testHashMap(){
        Map<String, String> map = new HashMap<>();
        map.put("key2","value2");
        map.put("key1","value1");
        map.put("key3","value3");
        assert map.get("key1").equals("value1");
        //key 与插入顺序无关
        String[] keys = map.keySet().toArray(new String[0]);
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            System.out.println("key = " + key);
        }
    }

    @Test
    public void testLinkedHashMap(){
        Map<String, String> map = new LinkedHashMap<>();
        map.put("key2","value2");
        map.put("key1","value1");
        map.put("key3","value3");
        assert map.get("key1").equals("value1");
        //key 与插入顺序有关
        String[] keys = map.keySet().toArray(new String[0]);
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            System.out.println("key = " + key);
        }
    }

}
