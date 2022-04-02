package Test;

import java.util.Arrays;

public class Midterm_check {
    public static void main(String[] args) {

        //Method 1 check

        int userArray[] = {23,67,35};
        Midterm.sortArray(userArray);
        System.out.println(Arrays.toString(userArray));

        int num2 = 555;
        System.out.println("Sum of digits in this number is -> " + Midterm.addDigits(num2));

        int[] array3 = {12,22,33,44};
        int[] finalArray = Midterm.removeValueFromArray(22,array3);
        System.out.println(Arrays.toString(finalArray));

        String[] array1 = {"happY", "king", "peace", "living standard"};
        String[] array2 = {"king kong", "Happy", "PEACE"};
        Midterm.printCommons(array1,array2);


    }



}
