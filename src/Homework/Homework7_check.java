package Homework;

public class Homework7_check {
    public static void main(String[] args) {

        // Method 1

        System.out.println(Homework7.titlecase("happy birthday"));

        // Method 2
        String answer = Homework7.makeAbbreviation("happy birthday to you");
        System.out.println("Abbreviation from your sentence is -> " + answer);

        // Method 3
        int [] array = {23,34,55,90};
        int findMaximum = Homework7.findMaxInArray(array);
        System.out.println(findMaximum);

        // Method 4

        boolean wordCheck = Homework7.isItPalindrome("learn");

        // Method 5

        String [] inputArray = {"happy", "happy new year", "peaceful", "king kong"};
        String longest = Homework7.maxString(inputArray);


    }


}
