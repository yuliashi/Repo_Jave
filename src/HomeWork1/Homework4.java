package HomeWork1;

public class Homework4 {
    public static void main(String[] args) {

        // Task 1
        String sentence1 = "I love swimming";
        int result1 = sentence1.length() >= 5 ? 10 : 15;
        System.out.println("The length of sentence '" + sentence1 + "' is " + sentence1.length());
        System.out.println("result1 is " + result1);

        // Task 2
       String name = "Yulia ShibanovA";
       String LastLetter = "a";
       System.out.println("Length of " + name + " is " + name.length());
       String name_lower = name.toLowerCase();
       // check if contains the letter
       boolean contains = name_lower.contains(LastLetter.toLowerCase());
       System.out.println("Does '" + name + "' contain '" + LastLetter + "'? -> " + contains);
       // check if ends with the letter
       boolean doesNameEndWith = name_lower.endsWith(LastLetter.toLowerCase());
       System.out.println("Does '" + name + "' end with '" + LastLetter + "'? -> " + doesNameEndWith);

       // Task 3
        String task3 = "View the latest news and breaking news today for US, world, weather";
        String word1 = "King";
        String task3_lower = task3.toLowerCase();
        boolean doesItContain = task3_lower.contains(word1.toLowerCase());
        System.out.println("Does '" + task3 + "' contain '" + word1 + "'? -> " + doesItContain);
        // index of 1st occurance of "Ew"
        String word2 = "Ew";
        int findIndex = task3_lower.indexOf(word2.toLowerCase());
        System.out.println("What is the index of '" + word2 + "' in the following sentence: '" + task3 + "'? -> " + findIndex);

        // Task 4
        String task4 = "kINg";
        String task4_lower = task4.toLowerCase();
        char firstLetter = task4_lower.charAt(0);
        String c = ""+firstLetter;
        System.out.println("\n" + c.toUpperCase() + task4_lower.substring(1));

    }
}
