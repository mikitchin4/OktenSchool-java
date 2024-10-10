package Lesson4.task2;

//Створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом.

import java.util.ArrayList;
import java.util.Comparator;

public class lesson4 {
    public static void  main(String[] args) {

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("lorem"));
        words.add(new Word("ipsum"));
        words.add(new Word("dolor"));
        words.add(new Word("sit"));
        words.add(new Word("amet"));
        words.add(new Word("consectetur"));
        words.add(new Word("adipiscing"));
        words.add(new Word("elit"));
        words.add(new Word("duis"));
        words.add(new Word("condimentum"));
        words.add(new Word("sed"));
        words.add(new Word("metus"));
        words.add(new Word("in"));
        words.add(new Word("tincidunt"));
        words.add(new Word("nam"));
        words.add(new Word("vulputate"));
        words.add(new Word("felis"));
        words.add(new Word("quam"));
        words.add(new Word("nec"));
        words.add(new Word("finibus"));

        words.sort(new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getWord().compareTo(o2.getWord());
            }
        });

        System.out.println(words);

    }
}