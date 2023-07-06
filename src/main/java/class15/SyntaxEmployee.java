package class15;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/

    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.empId="123455";
        asghar.salary=9000;
        System.out.println(asghar.CEO);//not good way
        System.out.println(SyntaxEmployee.CEO);// 99.99 this is how they are used


        SyntaxEmployee sohoail=new SyntaxEmployee();
        sohoail.empId="12342";
        sohoail.salary=92000;
        System.out.println(sohoail.empId);
        System.out.println(asghar.empId);
    }
}
