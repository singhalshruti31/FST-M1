package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Yellow");
        map.put(4,"Orange");
        map.put(5, "Black");

        System.out.println("Values in the Map are :: "+map);
        System.out.println("Size of the map :: "+map.size());
        System.out.println("Check if Green exists :: "+map.containsValue("Green"));
        System.out.println("Check if Orange exists :: "+map.containsValue("Orange"));
        System.out.println("Check if key 13 exists :: "+map.containsKey(13));
        System.out.println("Check if key 3 exists :: "+map.containsKey(3));

        System.out.println(map.remove(3));
        System.out.println("Values in the Map are :: "+map);
    }
}
