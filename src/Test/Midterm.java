package Test;

import java.util.Arrays;

public class Midterm {

    // Method 1
    //Create a method to return an int-array after sorting a given input-int-array

    public static int[] sortArray(int[] inputArray) {
        for (int x = 0; x < inputArray.length - 1; x++) {
            if (inputArray[x] > inputArray[x + 1]) {
                int num = inputArray[x];
                inputArray[x] = inputArray[x + 1];
                inputArray[x + 1] = num;
            }
        }

        return inputArray;

    }

    // Method 2
    //Create a method to return the sum of digits in input-int-value
    public static int addDigits(int number) {
        int sum = 0;
        String s = Integer.toString(number);
        String[] digitArray = s.split("");
        for (int a = 0; a < digitArray.length; a++) {
            sum += Integer.parseInt(digitArray[a]);
        }
        return sum;
    }

    // Method 3
    // Create a method to return an int-array after removing input-int-value from an input-int-array
    public static int[] removeValueFromArray(int num2, int[] inputArr) {

        int lengthFinal = 0;
        for(int k=0; k<inputArr.length; k++){
            if(inputArr[k]!=num2){
                lengthFinal += 1;
            }
        }
        int[] outputArr = new int[lengthFinal];
        int i = 0;
        for (int n = 0; n < inputArr.length; n++) {
            if (inputArr[n] != num2) {
                outputArr[i] = inputArr[n];
                i++;
            }

        }
        return outputArr;
    }

    //Method 4
    //Create a method to print the common Strings values in two input-String-arrays
    public static void printCommons(String[] array1, String[] array2) {
        for (int c = 0; c < array1.length; c++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[c].equalsIgnoreCase(array2[j])){
                    System.out.println(array1[c].toLowerCase());
                }

            }

        }
    }
}
