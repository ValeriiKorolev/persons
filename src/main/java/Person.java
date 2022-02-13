import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return !city.equals("");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //public OptionalInt getAge() {}


    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public void happyBirthday() {
        if (age > 0) age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(city);
    }

    @Override
    public String toString() {
        String ageCheck = (age > 0) ? String.valueOf(age) : "не известен";
        return "Персона: " + name + " " + surname + ", возраст: " + ageCheck + ", адрес: " + ((city == null) ? "отсутствует" : city);
    }

}
