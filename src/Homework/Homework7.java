package Homework;

public class Homework7 {
    public static String makeAbbreviation (String inputStr){
       String[] array = inputStr.split(" ");
       String newAbbr = "";
       for (int d=0; d<array.length; d++){
            newAbbr += array[d].substring(0,1).toUpperCase();
       }
       return newAbbr;
  }

    public static String titlecase (String inputTitle) {

        String[] arrayTitle = inputTitle.toLowerCase().split(" ");
        String outputTitle = " ";
        for (int x=0; x < arrayTitle.length; x++) {
        String firstLetter = arrayTitle[x].substring(0,1).toUpperCase();
        outputTitle += " " + firstLetter + arrayTitle[x].substring(1);
        }
        return outputTitle.trim();

    }

    public static int findMaxInArray (int [] inputArray) {
        int maxNum = inputArray[0];
        for (int x = 1; x < inputArray.length; x++) {
            if (inputArray[x] > maxNum) {
                maxNum = inputArray[x];
            }
        }
        return maxNum;
    }

    public static boolean isItPalindrome(String word){
        String[] byLetters = word.split("");
        String reverseWord = "";
        for (int t=1; t<=byLetters.length; t++){
            reverseWord += byLetters[byLetters.length-t];
        }
        if(reverseWord.equals(word)){
            System.out.println(word + " is a palindrome");
            return true;
        }else{
            System.out.println(word + " is not a palindrome");
        }
        return false;
    }

    public static String maxString (String[] stringArray){
        String maxString = stringArray[0];
        for (int x=1; x< stringArray.length; x++){
            if (stringArray[x].length()>maxString.length()){
                maxString = stringArray[x];
           }

        }
        System.out.println("The longest phrase is -> '" + maxString + "'");
        return maxString;
    }
}
