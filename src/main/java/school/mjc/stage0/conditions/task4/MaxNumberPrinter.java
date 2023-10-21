package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result;
        result = (first > second) ? (first > third ? first : third) : (second > third ? second : third);
        System.out.println(result);


    }

    public static void main(String[] args) {
        MaxNumberPrinter printer = new MaxNumberPrinter();
        printer.printGreatest(3,4,7);
    }
}
