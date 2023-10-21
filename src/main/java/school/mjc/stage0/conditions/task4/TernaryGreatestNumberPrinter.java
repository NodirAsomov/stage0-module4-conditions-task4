package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int result;
        result = (first > second) ? first : second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        TernaryGreatestNumberPrinter ternaryGreatestNumberPrinter = new TernaryGreatestNumberPrinter();
        ternaryGreatestNumberPrinter.printGreatest(3,9);
    }
}
