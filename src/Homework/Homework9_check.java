package Homework;

import java.util.ArrayList;

public class Homework9_check {
    public static void main(String[] args) {

        // Q1 check
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("city");
        arrList.add("arch");
        arrList.add("water");
        arrList.add("clock");
        arrList.add("diamond");
        arrList.add("city");
        String wordToCheck = "CITY";
        int matches = Homework9.getCount(wordToCheck, arrList);
        System.out.println("The word " + wordToCheck + " appears in array " + matches + " times");

        //Q2 check
        ArrayList<String> arrList2 = new ArrayList<>();
        arrList2.add("city");
        arrList2.add("arch");
        arrList2.add("water");
        arrList2.add("clock");
        arrList2.add("diamond");
        arrList2.add("city");
        arrList2.add("Exciting");
        String stringToCheck = "IT";
        int answer = Homework9.getCountOfStringValues(stringToCheck, arrList2);
        System.out.println("The string " + stringToCheck + " appears in array " + answer + " times");

    }
}
