  class Student {
    public String name;
    public int rollnumber;
    public String course;
    public int age;

    public Student(String name , int rollnumber , String course , int age){
          this.name = name;
          this.rollnumber = rollnumber;
          this.course = course;
          this.age = age ;
    }

    public void details(){
        System.out.println(" student name" + this.name);
        System.out.println("student rollnumber"+ this. rollnumber);
        System.out.println("course" +  this.course);
        System.out.println("student age" + this.age);
    }

};

public class Assignment1{
    public static void main(String args [] ){
        Student s1 = new Student("rishabh" ,1,"web dev" ,18);
        Student s2 = new Student("sravan" ,2, "ml",19);
        Student s3 = new Student("vikash" , 3 ,"java devlopment",20);
        Student s4 = new Student("ramesh",4,"graphic designing",21);
        
        s1.details();
        System.out.println();
        s2.details();
        System.out.println();
        s3.details();
        System.out.println();
        s4.details();
    }
}
