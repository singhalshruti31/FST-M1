package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter List of Integers (Enter any String value to discontinue) ::");

        while (scan.hasNextInt()){
            list.add(scan.nextInt());
        };

        if(list.size()>0) {
            Integer[] numbs = list.toArray(new Integer[0]);
            int index = indexGen.nextInt(numbs.length);
            System.out.println("Selected Index has value :: " + index);
            System.out.println("Array value at index :: " + index + " is :: " + numbs[index]);
        }
        else{
            System.out.println("Array do not have Integer values");
        }
    }
}


