public class PersonBuilder {

    public String name;
    public String surname;
    public int age;
    public String city;


    public PersonBuilder setName(String nameNew) {
        name = nameNew;
        return this;
    }

    public PersonBuilder setSurname(String surnameNew) {
        surname = surnameNew;
        return this;
    }

    public PersonBuilder setAge(int ageNew) throws IllegalArgumentException {
        if (ageNew < 0) throw new IllegalArgumentException("Значение 'возраст' не может быть отрицательным.");
        age = ageNew;
        return this;
    }

    public PersonBuilder setAddress(String addressNew) {
        city = addressNew;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (this.name == null || this.surname == null)
            throw new IllegalStateException("Поля 'имя' и 'фамилия' должны быть заполнены.");
        return new Person(name, surname, age, city);
    }


}
