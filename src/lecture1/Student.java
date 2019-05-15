package lecture1;

public class Student extends Person {
    private String school;
    private int grade;

    public Student()
    {
        this.school = "Default School";
        this.grade = 0;
    }

    public Student(String school, int grade)
    {
        this.school = school;
        this.grade = grade;
    }

    public void changeAge(){
        setAge(10);
    }

    public String toString()
    {
        return "This student is " + getAge();
    }
}
