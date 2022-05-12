package asssignment6;

public class Constructor2 {
    private String s;
    public Constructor2(String s){
        this.s=s;
        System.out.println(s);
    }

    public static void main(String[] args) {
        Constructor2 arr[]=new Constructor2[5];
        for(int i=0;i<5;i++){
            arr[i]=new Constructor2("nikhil");
        }
    }
}
