package Homework;

public class Homework5 {
    public static void main(String[] args) {

        //Q 1
        String country = "Canada";
        String[] array1 = country.split("");
        System.out.println("The length of the country name " + country + " is " + array1.length);


        //Q 2
        String sentence = "Health was Earlier said to Be the ability of the body functioning Well";
        String[] array2 = sentence.split(" ");
        System.out.println("The word count in the sentence is " + array2.length);

        //Q 3
        String sentence2 = "Make America great again";
        String[] array3 = sentence2.split(" ");
        String a = array3[0].substring(0, 1);
        String b = array3[1].substring(0, 1);
        String c = array3[2].substring(0, 1);
        String d = array3[3].substring(0, 1);
        System.out.println("The abbreviation from '" + sentence2 + "' -> " + a.toUpperCase() + b.toUpperCase() + c.toUpperCase() + d.toUpperCase());


        //Q 4
        int num = 2;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by 3 & 5");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        } else if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is non-divisible by 3 or 5 ");
        }

        //Q 5
        double studentScore = -3;
        int maxScore = 150;
        double x = studentScore / maxScore * 100;
        if (x <= 100 && x >= 91) {
            System.out.println("student score is " + x + "% your Grade is A");
        } else if (x >= 81) {
            System.out.println("student score is " + x + "% your Grade is B");
        } else if (x >= 71) {
            System.out.println("student score is " + x + "% your Grade is C");
        } else if (x >= 61) {
            System.out.println("student score is " + x + "% your Grade is D");
        } else if (x > 0) {
            System.out.println("student score is " + x + "% your Grade is E");
        } else {
            System.out.println("Error");
        }

        //91%-100% - Grade A;
        //81%-90.99% - Grade B;
        //71%-80.99% - Grade C;
        //61%-70.99% - Grade D;
        //below 60.99% - Grade E;
        //Otherwise - error message

        //Q 6
        String[] words = {"healthy", "speak", "learning", "king", "joy", "smile", "learn", "live", "give", "living standards", "life"};
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 5 && words[i].charAt(0) == 'l') {
                System.out.println(words[i]);
            } else {
                System.out.println("No words that satisfy the condition");
            }
        }

    }
}