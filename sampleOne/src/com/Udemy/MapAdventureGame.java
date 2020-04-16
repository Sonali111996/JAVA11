package com.Udemy;
import java.util.HashMap;
public class MapAdventureGame {
    private final int locationId;
    private final String description;
    private final HashMap<String,Integer> hm;

    public MapAdventureGame(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.hm = new HashMap<String, Integer>();
    }
    public void addHashMap(String direction,int location){
            hm.put(direction,location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<String, Integer> getHm() {
        return new HashMap<String, Integer>(hm);
    }
}
