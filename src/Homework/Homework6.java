package Homework;

public class Homework6 {
    public static void main(String[] args) {

        // Q1 Create the abbreviation
        // Make America Great Again
        // Good Morning
        //Happy Birthday to you dear friend
        //Hello
        //Air Balloon
        String sentence = "Happy birthday to you dear friend";
        String[] array = sentence.split(" ");
        String newAbbr = "";
        for (int p=0; p < array.length; p++){
            newAbbr += array[p].substring(0, 1);
        }
        System.out.println("Abbreviation from '" + sentence + "' -> " + newAbbr.toUpperCase());

        // Q2
        // Reverse "make america great again"
        //Good morning
        //learn
        //happy birthday to you
        String sentence2 = "happy birthday";
        String[] words = sentence2.split(" ");
        String answer = "";
        int length = words.length;
        for (int y=1; y<=length; y++) {
            answer = answer + " " + words[length-y];
        }
        answer = answer.trim();
        System.out.println(answer);

        // Q3
        //Convert the String value into Titlecase
        //make america great again
        String sentence3 = "make america great again";
        String[] arrayTitle = sentence3.toLowerCase().split(" ");
        String title = "";
        for (int x=0; x < arrayTitle.length; x++) {
            String firstLetter = arrayTitle[x].substring(0,1).toUpperCase();
            title = title + " " + firstLetter + arrayTitle[x].substring(1);
        }
        title = title.trim();
        System.out.println("The sentence3 in Titlecase is -> " + title);

        // Q4
        //Find the minimum value from given array

        int[] numbers = {1, -1};
        int minValue = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if ( numbers[i] < minValue){
                minValue = numbers[i];

            }

        }

        System.out.println("minValue is -> " + minValue);



    }
}
