package lambdas;

public class TargetType {
    interface Email{
        String getEmail(String name);
    }
    static void printEmail(String name,Email e){
        System.out.println(e.getEmail(name));
    }

    public static void main(String[] args) {
        //type Email
        Email e=(String name)->name+"@zemosolabs.com";
        printEmail("nikhil.chandra",e);
        printEmail("nikhil",e);
    }

}
