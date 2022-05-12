package InnerClass;

class FirstOuter{
    class FirstInner{
        public FirstInner(String s){
            System.out.println(s);
        }
    }
}
class Second{
    class SecondInner extends FirstOuter.FirstInner{

        public SecondInner(FirstOuter firstOuter, String s) {
            firstOuter.super(s);
        }

    }
}
class Assignment7{
    public static void main(String[] args) {
        Second sec=new Second();
        FirstOuter firstOuter=new FirstOuter();
        Second.SecondInner secondInner=sec.new SecondInner(firstOuter,"Nikhil");
    }
}
