package com.hspedu.map_;

import java.util.HashMap;

public class Map_ {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("No1", "丁真");
        map.put("No2", "保国");
        map.put("No3", "亦凡");
        map.put("No4", "王源");
        System.out.println(map);
        System.out.println(map.get("No3"));
    }
}
