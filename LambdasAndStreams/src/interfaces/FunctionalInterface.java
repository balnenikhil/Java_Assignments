package interfaces;

public class FunctionalInterface {
    interface Multiplier {
        int multiply(int i, int j);
    }
    Multiplier multiplierLambda=(a,b)->a*b;
    public static void main(String[] args) {
        FunctionalInterface client = new FunctionalInterface();

    }
}
