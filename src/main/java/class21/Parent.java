package class21;

public class Parent {
    final int numbersOfMonthInYear=12;//no wan can change this values of this variable  in te class

    final void getMary(){ //no can use this methode

        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}

class Axel extends Parent{
    @Override
    void study(){
        System.out.println("No i want SDET");
    }
}
