public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(33)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(3)
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        mom.happyBirthday();
        System.out.println(mom);

        // Не хватает обяхательных полей
        Person person = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .build();
        System.out.println(person);
        person.setAddress("London");
        System.out.println(person);

        // отсутствуют обязательные данные
        Person person1 = new PersonBuilder()
                .setName("Анна")
                .build();
    }
}
