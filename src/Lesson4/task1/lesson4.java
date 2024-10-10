package Lesson4.task1;

//Створити List Юзерів
//- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class lesson4 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Olexandr", 25));
        users.add(new User("Marta", 30));
        users.add(new User("Ivan", 22));
        users.add(new User("Nadiia", 28));
        users.add(new User("Petro", 35));

        users.sort(Comparator.comparingInt(User::getAge));
        users.forEach(System.out::println);

        users.sort(Comparator.comparingInt(User::getAge).reversed());
        users.forEach(System.out::println);

        users.sort(Comparator.comparingInt(user -> user.name.length()));
        users.forEach(System.out::println);

        users.sort(Comparator.comparingInt((User user) -> user.name.length()).reversed());
        users.forEach(System.out::println);
    }
}
