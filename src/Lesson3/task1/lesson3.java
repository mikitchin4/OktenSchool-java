package Lesson3.task1;

//а) Оприділити інтерфейс Printable, який містить метод void print().
//б) Оприділити клас Book, що реалізує інтерфейс Printable.
//в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
//г) Створити масив типу Printable, який буде містити книги та журнали.

import java.util.ArrayList;

public class lesson3 {
    public static void main(String[] args) {

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("The 48 Laws of Power", "Robert Greene"));
        printables.add(new Book("Verity", "Colleen Hoover"));
        printables.add(new Book("The Very Hungry Caterpillar", "Eric Carle"));
        printables.add(new Magazine("Playboy"));
        printables.add(new Magazine("Forbes"));

        for (Printable printable : printables) {
            System.out.println(printable);
        }
    }
}
