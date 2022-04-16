package Homework;

import java.util.*;

public class Homework10 {
    public static boolean isThereDuplicate(String[] myList){
        boolean isDup = false;
        List<String> myArrayList = new ArrayList<>(Arrays.asList(myList));
        System.out.println(myArrayList.size());
        Set<String> names = new HashSet<>(myArrayList);
        int arrayLength = myList.length;
        int setSize = names.size();
        if(arrayLength >= setSize){
            System.out.println("Your array has duplicate values");
        }else{
            System.out.println("Your array has no duplicate values");
        }
        return isDup;

    }

    public static List<String> returnDuplicates(String[] names){
        List<String> dupNames = new ArrayList<>();
        for (int i=0; i < names.length; i++) {
            for (int p=i+1; p<names.length; p++){
                if(names[i].equalsIgnoreCase(names[p])){
                    dupNames.add(names[i]);
                }
            }

        }
        System.out.println("Duplicate value: " + dupNames);
        return dupNames;
    }
}
