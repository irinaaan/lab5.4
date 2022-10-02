public class Person {
    private String surname;
    private String name;
    private int age;

    public Person(String surname, String name, int age){
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}