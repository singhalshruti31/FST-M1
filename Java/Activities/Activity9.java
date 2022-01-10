package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("Shruti");
        myList.add("Shubham");
        myList.add("Shipra");
        myList.add("Keshav");
        myList.add("Devansh");

        for(String s:myList){
            System.out.println(s);
        }
        System.out.println("Value at 3rd Index in the list is :: "+myList.get(3));
        System.out.println("Size of the array list is :: "+myList.size());

        if(myList.contains("Devansh")){
            System.out.println("Exist");
        }else System.out.println("No");
        myList.remove("Keshav");
        System.out.println("Size of the array list is :: "+myList.size());
        for(String s:myList){
            System.out.println(s);
        }
    }
}
