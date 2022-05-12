package Cycle;

class Cycle {
    public Cycle() {
        System.out.println("This is Cycle");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("I balance with one Wheel");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("I balance with Two wheels");
    }
}
class Tricycle extends Cycle{
}
public class MainCycle{
    public static void main(String[] args) {
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        Cycle arr[]=new Cycle[3];
        //upcasting objects to cycle i.e Parent class
        arr[0]=(Cycle)unicycle;
        arr[1]=(Cycle)bicycle;
        arr[2]=(Cycle)tricycle;
        //cannot refer to child class method  balance since the method balance is not present in parent class
        /*for(int i=0;i<3;i++)
            arr[i].balance();*/
        //child class objects that have balance methods can be invoked by their objects
        unicycle.balance();
        bicycle.balance();

    }
}
