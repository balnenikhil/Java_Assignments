package nikhil.assignment.singleton;

public class Singleton {
    private String s;
    public static Singleton initialize(String val){
        Singleton singleton=new Singleton();
        singleton.s=val;
        return singleton;
    }
    public void printString(){
        System.out.println(s);
    }
}
