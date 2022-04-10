package Homework;

import java.util.ArrayList;
import java.util.List;


public class Homework9 {

    // Q1
    public static int getCount(String valToCheck, ArrayList<String> arrayList) {
        int numberOfWords = 0;
        for (int i=0; i<arrayList.size(); i++) {
            String value = arrayList.get(i);
            if(value.equalsIgnoreCase(valToCheck)){
                numberOfWords += 1;
            }
        }
        return numberOfWords;
    }

    //Q2
    public static int getCountOfStringValues (String valToCheck, ArrayList<String> arrayList){
        int numberOfOccasions = 0;
        for(int t=0; t< arrayList.size(); t++) {
            String value2 = arrayList.get(t).toLowerCase();
            if(value2.contains(valToCheck.toLowerCase())){
                numberOfOccasions += 1;
            }
        }
        return numberOfOccasions;
    }

    //Q3
    public static int[] removeFromList(int valueToRemove, ArrayList<Integer> myList){
        List<Integer> myNewList = ArrayList<Integer>();
        for(int a=0; a< myList.size(); a++) {
            if(valueToRemove == myList.get(a)){
                myList.remove(a);
            }
        }
        return myNewList;
    }



}
