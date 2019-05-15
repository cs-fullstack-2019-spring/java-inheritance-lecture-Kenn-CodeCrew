import lecture1.*;
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Kevin");
        Student person2 = new Student();
        Teacher person3 = new Teacher();

        System.out.println(person1.getName());
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3 + "\n");

        person1.setName("Kevin");
        person1.changeAge();
        person2.changeAge();
        person3.changeAge();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3 + "\n");
    }
}
