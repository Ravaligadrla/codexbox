package Keywords;

import java.util.Scanner;

public class Student {

    Student(int a)
    {
        this.marks=a;
    }
Student(String name){
        this.name=name;
}
   public   int marks= 5646;

   public int marks1=876;
   public  int id=34;

   public String name="rasi";

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

 public static void main(String[]args) {
        Student S= new Student(890);
        Student S1=new Student("tyy");
     System.out.println(S.marks1);

     Scanner scanner= new Scanner(System.in);
     System.out.println("Enter marks: " );
     System.out.println(S.marks1);

     System.out.println(S.marks);

     System.out.println(S.getId());

     System.out.println(S.getMarks());

     System.out.println(S.getName());


 }

 }








