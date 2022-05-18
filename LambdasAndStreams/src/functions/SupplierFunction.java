package functions;

import java.util.function.Supplier;

public class SupplierFunction {
    Supplier<String[]> fruitSupplier= () -> new String[]{"apple","orange"};
    private void testSupplier()
    {
        String[] fruits=fruitSupplier.get();
        for(String fruit:fruits)
        {
            System.out.println(fruit);
        }
    }
    public static void main(String[] args) {
        new SupplierFunction().testSupplier();
    }
}