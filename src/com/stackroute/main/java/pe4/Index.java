package com.stackroute.main.java.pe4;

import java.util.List;
import java.util.Map;

class Index {

    private Map<String, List<Integer>> mapList;

    Index(Map<String, List<Integer>> mapList) {
        this.mapList = mapList;
    }

    @Override
    public String toString() {
        return String.format("Start indices: %s", mapList.get("startindex").toString()) + "\n" +
                String.format("End indices: %s", mapList.get("startindex").toString());
    }
}
