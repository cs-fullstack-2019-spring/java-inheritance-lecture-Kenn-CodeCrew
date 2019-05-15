package lecture1;

public class Teacher extends Person {
    private String subject;
    private int years;

    public void changeAge(){
        setAge(60);
    }

    public String toString()
    {
        return "This teacher's age is " + getAge();
    }
}
