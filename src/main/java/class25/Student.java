package class25;

public class Student {
    String name;
    String id;
    int age;
    public Student(String name,String id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    @Override
    public String toString() {//toString methods field printing in counselor actual value of the class
        return "Student{" +
                "name='" + name + '\'' + //backward slash(\) to skip
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

}
