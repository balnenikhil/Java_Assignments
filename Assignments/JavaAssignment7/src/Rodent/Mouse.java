package Rodent;

public class Mouse implements Rodent {
    public Mouse() {
        System.out.println("Hii , Iam Mouse from Rodent Family");
    }

    @Override
    public void getMyLooks() {
        System.out.println("I have a long tail and face");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I run Faster than all Rodents");
    }
}
