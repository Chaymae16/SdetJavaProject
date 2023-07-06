package class23;

public interface MoveAble {

    //  public static final int age;
    int age=12;

     void move(); //abstract by default also public
}

 interface WashAble{
    void wash();
}

class Dog implements MoveAble,WashAble{
    @Override
    public void wash(){
        System.out.println("You can wash me");
    }

    @Override
    public void move() {
        System.out.println("Moving.....");

    }
}
class Cat implements MoveAble{
    @Override
    public void move(){
        System.out.println("Cats can also move");
    }
}


class Horse{
    public void move(){
        System.out.println("Horses can also move");
    }
}
