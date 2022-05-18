package Interface;

interface first{
    void m1();
    void m2();
}
interface second{
    void m3();
    void m4();
}
interface third{
    void m5();
    void m6();
}
class concrete{

}
interface last extends first,second,third {
    void m7();
}
class Implementor extends concrete implements last {
    @Override
    public void m1() {
        System.out.println("In method m1");
    }

    @Override
    public void m2() {
        System.out.println("In method m2");
    }

    @Override
    public void m3() {
        System.out.println("In method m3");
    }

    @Override
    public void m4() {
        System.out.println("In method m4");
    }

    @Override
    public void m5() {
        System.out.println("In method m5");
    }

    @Override
    public void m6() {
        System.out.println("In method m6");
    }

    @Override
    public void m7() {
        System.out.println("In method m7");
    }
    public void method1(first obj){
            obj.m1();
            obj.m2();
    }
    public void method2(second obj){
            obj.m3();
            obj.m4();
    }
    public void method3(third obj){
            obj.m5();
            obj.m6();
    }
    public void method4(last obj){
            obj.m7();
    }

}
class InterfaceImpl{
    public static void main(String[] args) {
        Implementor implementor=new Implementor();
        implementor.method1(implementor);
        implementor.method2(implementor);
        implementor.method3(implementor);
        implementor.method4(implementor);
    }
}