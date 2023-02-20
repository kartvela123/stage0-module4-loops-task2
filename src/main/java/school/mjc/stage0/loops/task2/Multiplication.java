package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int res = 0;
        if (multiplyByAndToInclusive < 0) {
            res = multiplyByAndToInclusive*(-1);
        } else {
            res = multiplyByAndToInclusive;
        }
        int count = 0;
        while (count != res + 1) {
            System.out.println(multiplyByAndToInclusive * count);
            count++;


        }
    }
}
