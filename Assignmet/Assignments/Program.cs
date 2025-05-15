using System;
class Student
{
    public String name;
    public int rollnumber;
    public String course;
    public int age;

    public Student(String name, int rollnumber, String course, int age)
    {
        this.name = name;
        this.rollnumber = rollnumber;
        this.course = course;
        this.age = age;
    }

    public void details()
    {
        Console.WriteLine(" student name :" + this.name);
        Console.WriteLine("student rollnumber :" + this.rollnumber);
        Console.WriteLine("course :" + this.course);
        Console.WriteLine("student age :" + this.age);
    }

}

class Program
{
    public static void Main()
    {
        Student s1 = new Student(" rishabh", 1, "web dev", 18);
        Student s2 = new Student(" sravan", 2, "ml", 19);
        Student s3 = new Student(" vikash", 3, "java devlopment", 20);
        Student s4 = new Student(" ramesh", 4, "graphic designing", 21);

        s1.details();

        s2.details();

        s3.details();

        s4.details();
    }
}
