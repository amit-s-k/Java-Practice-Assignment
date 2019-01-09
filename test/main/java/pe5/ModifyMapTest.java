package main.java.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ModifyMapTest {
    @Test
    public void testForModifyingMap() {
        ModifyMap modifyMap = new ModifyMap();
        Map<String, String> map = new HashMap<>();
        map.put("val1", "java");
        map.put("val2", "katherine");
        Map<String, String> modifiedMap = new HashMap<>();
        modifiedMap.put("val1", "");
        modifiedMap.put("val2", "java");
        assertEquals(modifiedMap, modifyMap.modifyMap(map));
    }
}