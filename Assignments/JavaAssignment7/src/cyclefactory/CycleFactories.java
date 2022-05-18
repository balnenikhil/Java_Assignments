package cyclefactory;

public class CycleFactories{
    public static void main(String[] args) {
        Cycle unicycle=new Unifactory().getCycle();
        Cycle Bicycle=new Bifactory().getCycle();
        Cycle Triycle=new Trifactory().getCycle();
        unicycle.rideNow();
        Bicycle.rideNow();
        Triycle.rideNow();
    }
}