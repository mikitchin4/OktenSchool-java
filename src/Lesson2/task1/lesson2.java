package Lesson2.task1;

//створити клас, який би описував подібні об'єкти використовуючи композицію/агрегацію
//https://jsonplaceholder.typicode.com/users/1

public class lesson2 {

    public static void main(String[] args) {

    User user = new User(
            1,
            "Andriy",
            "Ant002",
            "Ant002@gmail.com",
            new Address("Shevchenko str.", "32", "Kyiv", "300400", "0.055648", "0.7745641"),
            "+380987654321",
            "000.org.ua",
            new Company("Andriuha LTD", "and that will do", "something here")
    );
    System.out.println(user);
}
}
