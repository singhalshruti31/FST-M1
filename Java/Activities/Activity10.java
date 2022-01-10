package activities;

import java.util.HashSet;
import java.util.Iterator;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("Once");
        hs.add("Twice");
        hs.add("Thrice");
        hs.add("Quarter");
        hs.add("Pent");
        hs.add("Hex");

        System.out.println("Size of the HashSet is :: "+hs.size());
        Iterator<String> ite = hs.iterator();
        while(ite.hasNext()){
            System.out.println("Value :: "+ite.next());
        }
        hs.remove("Twice");
        hs.remove("Segment");
        if(hs.contains("Twice"))
            System.out.println("Exist in set");
        else System.out.println("Not existent");
        System.out.println("Updated Size of the HashSet is :: "+hs.size());
        Iterator<String> ite1 = hs.iterator();
        while(ite1.hasNext()){
            System.out.println("Updated Value :: "+ite1.next());
        }
    }
}
