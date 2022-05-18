package cyclefactory;

public class Trifactory implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}
