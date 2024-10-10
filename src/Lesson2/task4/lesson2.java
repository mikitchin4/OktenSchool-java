package Lesson2.task4;

//Створити клас котрий відповідає наступній моделі
//{
//id: 1,
//name: 'vasya',
//surname: 'pupkin',
//email: 'asd@asd.com',
//age: 31,
//gender: 'MALE',
//skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//car: {model: 'toyota', year: 2021, power: 250}
//        }
//Використати композицію/агрегацію та енами в потрібному місці.


public class lesson2 {

    public static void main(String[] args) {


        User user = new User(
                1,
                "Yura",
                "Repetylo",
                "YR94@gmail.com",
                23,
                Gender.MALE,
                new Car("Audi", 2024, 389)
        );
        user.getSkills().add(new Skill("Java", 2));
        user.getSkills().add(new Skill("JS", 3));

        System.out.println(user);


    }
}
