package Homework;

import java.util.List;

public class Homework10_check {
    public static void main(String[] args) {

        //Q1 check
        String[] words = {"peace", "grow", "joy", "lauGh", "happy", "laugh", "joy", "happy"};
        boolean Dups = Homework10.isThereDuplicate(words);

        //Q2 check
        String[] words2 = {"peace", "grow", "joy", "lauGh", "happy", "laugh", "joy", "happy"};
        List<String> answers = Homework10.returnDuplicates(words2);

    }
}
