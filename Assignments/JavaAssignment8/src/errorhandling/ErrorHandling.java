package errorhandling;

class ErrorHandling {

    public void callMethod() throws Exception{
        int arr[] = new int[5];
        System.out.println(arr[8]);

        ErrorHandling error= null;
        error.someFun();

        int number1=7,number2=0,result;
        result=number1/number2;
        System.out.println(result);


    }


    private void someFun() {
        System.out.println("some function!");
    }


    public static void main(String[] args) throws Exception {
        try{
            ErrorHandling error = new ErrorHandling();
            error.callMethod();
        }
        catch(ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block code executed!");
        }
    }

}
