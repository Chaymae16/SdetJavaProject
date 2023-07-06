package class21;

public class StudentPloyTester {
    public static void main(String[] args) {
        //parent class
        Student[] student = {new SyntaxStudent("chaymae", "Af233", 24),
                new SchoolStudent("ALI", "1fdfa", 76),
                new CollegeStudent("lina", "qr244", 56)
        };
        for (Student stu : student) {
            if(stu instanceof SyntaxStudent){
                ((SyntaxStudent)stu).typingInchat();
            }
            stu.talk();
            stu.explain();
            stu.write();
        }


        Student syntax = new SchoolStudent("chaymae", "Af233", 24);
        if (syntax instanceof SyntaxStudent) {
            ((SyntaxStudent) syntax).typingInchat();
        } else {
            System.out.println("Typing casting not possible");
        }
    }
}
