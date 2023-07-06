package class18;

public class Furniture {
    String color="Black";
}
class Chair extends Furniture{
    String color="White";
    void printColor(){
        String color="Blue";//Local variable
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);//this for instance variable
        //super for get color from super class parent class
        //first  local. 2 instance same clas. 3 instance variable of parent class
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
