package cyclefactory;

public class Bifactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}
