package asssignment6;

public class Constructor1 {
    public Constructor1(int num){
    this('a');
    }
    public Constructor1(char c){
        System.out.println("character is "+c);
    }

    public static void main(String[] args) {
        Constructor1 constructor1 = new Constructor1(12);
    }
}
