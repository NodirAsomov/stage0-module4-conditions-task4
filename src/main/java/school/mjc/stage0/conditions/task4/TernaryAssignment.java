package school.mjc.stage0.conditions.task4;

import java.io.FilterOutputStream;

public class TernaryAssignment {

    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
             int result;
        System.out.println( result = first < second ? 10 : -10);

    }
    public static void main(String[] args) {
        TernaryAssignment obj = new TernaryAssignment();
        obj.assignAndPrintBasedOnWhichBigger(200,90);
    }
}
