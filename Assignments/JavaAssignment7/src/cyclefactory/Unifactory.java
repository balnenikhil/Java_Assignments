package cyclefactory;

public class Unifactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}
