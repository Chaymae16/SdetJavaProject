package class21;
/*
Create a Class Student that will have 3 subclasses as
SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and
 override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {
    String name;
    String Id;
    int age;
    public Student(String name,String Id,int age){
        this.name=name;
        this.Id=Id;
        this.age=age;
    }
    void talk(){
        System.out.println("student talking");
    }
    void write(){
        System.out.println("student writing");
    }
    void explain(){
        System.out.println("student explaining");
    }

}

class SyntaxStudent extends Student{
    SyntaxStudent(String name,String Id,int age){
       super(name,Id,age);

    }
    @Override
    void talk(){
        System.out.println("speaking with CollegeStudent");
    }
    void typingInchat(){
        System.out.println("typing");
    }

}


class CollegeStudent extends Student{
    CollegeStudent(String name,String Id,int age){
        super(name,Id,age);
    }
    @Override
    void talk(){
        System.out.println("speaking with SyntaxStudent ");
    }

}


class SchoolStudent extends Student{
    SchoolStudent(String name,String Id,int age){
        super(name,Id,age);
    }

}
