package lambdas;


interface Movie{
    boolean check(int id);
}

public class MethodReference {
    Movie m = (id) -> id < 100;
    Movie m1 = MethodReference::isClassic;
    void testMovie(int id) {
        System.out.println(m.check(id));
        System.out.println( m1.check(id));

    }
    static boolean isClassic(int id){
        return true;
    }

    public static void main(String[] args) {
        new MethodReference().testMovie(100);

    }



}