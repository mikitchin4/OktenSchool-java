package Lesson5.task2;

//- Створити масив з 20 числами.
//        - за допомогою способу sorted відсортувати масив.
//        -- за допомогою filter отримати числа кратні 3
//        -- за допомогою filter отримати числа кратні 10
//        -- перебрати (проітерувати) масив за допомогою foreach()
//        -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші


import java.util.Arrays;

public class lesson5 {
    public static void main(String[] args) {

        int[] numbers = {5, 15, 30, 8, 45, 60, 20, 9, 12, 3, 25, 10, 16, 6, 4, 18, 7, 90, 21, 33};

        System.out.println("Відсортований масив:");
        Arrays.stream(numbers)
                .sorted()
                .forEach(System.out::println);

        System.out.println("Числа, кратні 3:");
        Arrays.stream(numbers)
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

        System.out.println("Числа, кратні 10:");
        Arrays.stream(numbers)
                .filter(num -> num % 10 == 0)
                .forEach(System.out::println);

        System.out.println("Перебір масиву за допомогою forEach():");
        Arrays.stream(numbers)
                .forEach(System.out::println);

        System.out.println("Масив, де всі значення у 3 рази більші:");
        Arrays.stream(numbers)
                .map(num -> num * 3)
                .forEach(System.out::println);
    }
}