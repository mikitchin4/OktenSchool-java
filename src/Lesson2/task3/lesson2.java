package Lesson2.task3;


//Створити клас ланцюг наслідування:
//Папірус-Книга-Журнал
//Папірус-Книга-Комікс
//Кількість полів довільна.

public class lesson2 {

    public static void main(String[] args) {

        Papyrus papyrus = new Papyrus(5000);
        Book book = new Book(1200, 400);
        Magazine magazine = new Magazine(450, 50, 10);
        Comics comics = new Comics(800, 48, 74);

        System.out.println(papyrus);
        System.out.println(book);
        System.out.println(magazine);
        System.out.println(comics);

    }
}
