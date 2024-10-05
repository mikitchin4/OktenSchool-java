package Lesson1;

//Загальне: всі поля класу приватні, додати гетери сетери (не використовуючи ломбок)

//public class lesson1 {
//    public static void main(String[] args) {
//
//        Person person = new Person("Yura", 23);
//        System.out.println(person);
//
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//
//        person.setName("Vitaliy");
//        System.out.println(person.getName());
//
//        person.setAge(31);
//        System.out.println(person.getAge());
//    }
//}

//- закінчити опис класів Car, Dog, Book (файли знаходяться в цій папці)
//створити 5 об'єктів класу, покласти в масив/ліст, проітерувати та вивести в консоль

//public class lesson1 {
//    public static void main(String[] args) {
//
//        Car car1 = new Car("Model1", 150, 2000, true);
//        Car car2 = new Car("Model2", 180, 2200, false);
//        Car car3 = new Car("Model3", 200, 2500, true);
//        Car car4 = new Car("Model4", 220, 2800, true);
//        Car car5 = new Car("Model5", 240, 3000, false);
//
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);
//        cars.add(car5);
//
//        for (Car car : cars) {
//            System.out.println("Model: " + car.getModel());
//            System.out.println("Power: " + car.getPower());
//            System.out.println("Engine Volume: " + car.getVolumeEngine());
//            System.out.println("Turbo: " + car.getTurbo());
//            System.out.println();
//        }
//    }
//}



//        - створити клас, який би описував подібні об'єкти
//https://jsonplaceholder.typicode.com/posts/1
//створити 5 об'єктів класу, покласти в масив/ліст, проітерувати та вивести в консоль


//public class lesson1 {
//    public static void main(String[] args) {
//
//        Posts post1 = new Posts(1, 1, "posts 1", "posts body 1");
//        Posts post2 = new Posts(2, 2, "posts 2", "posts body 2");
//        Posts post3 = new Posts(3, 3, "posts 3", "posts body 3");
//        Posts post4 = new Posts(4, 4, "posts 4", "posts body 4");
//        Posts post5 = new Posts(5, 5, "posts 5", "posts body 5");
//
//        ArrayList<Posts> posts = new ArrayList<>();
//        posts.add(post1);
//        posts.add(post2);
//        posts.add(post3);
//        posts.add(post4);
//        posts.add(post5);
//
//        for (Posts post : posts) {
//            System.out.println("User ID: " + post.getUserId());
//            System.out.println("ID: " + post.getId());
//            System.out.println("Title: " + post.getTitle());
//            System.out.println("Body: " + post.getBody());
//            System.out.println();
//        }
//    }
//}

//        - створити клас, який би описував подібні об'єкти
//https://jsonplaceholder.typicode.com/comments/1
//створити 5 об'єктів класу, покласти в масив/ліст, проітерувати та вивести в консоль

//public class lesson1 {
//    public static void main(String[] args) {
//
//        Comments comment1 = new Comments(1, 1, "Yura 1", "qwerty1@gmail.com", "body 1");
//        Comments comment2 = new Comments(1, 2, "Yura 2", "qwerty2@gmail.com", "body 2");
//        Comments comment3 = new Comments(1, 3, "Yura 3", "qwerty3@gmail.com", "body 3");
//        Comments comment4 = new Comments(1, 4, "Yura 4", "qwerty4@gmail.com", "body 4");
//        Comments comment5 = new Comments(1, 5, "Yura 5", "qwerty1@gmail.com", "body 5");
//
//        ArrayList<Comments> comments = new ArrayList<>();
//        comments.add(comment1);
//        comments.add(comment2);
//        comments.add(comment3);
//        comments.add(comment4);
//        comments.add(comment5);
//
//        for (Comments comment : comments) {
//            System.out.println("Post ID: " + comment.getPostId());
//            System.out.println("ID: " + comment.getId());
//            System.out.println("Name: " + comment.getName());
//            System.out.println("Email: " + comment.getEmail());
//            System.out.println("Body: " + comment.getBody());
//            System.out.println();
//        }
//    }
//}