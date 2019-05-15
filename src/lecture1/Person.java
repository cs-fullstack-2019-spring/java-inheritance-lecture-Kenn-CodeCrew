package lecture1;

public class Person {
    private String name;
    private int age = 40;

    public Person()
    {
        this.name = "Default Name";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void changeAge(){
        age = 35;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public String toString()
    {
        return "This person's age is: " + age;
    }
}
