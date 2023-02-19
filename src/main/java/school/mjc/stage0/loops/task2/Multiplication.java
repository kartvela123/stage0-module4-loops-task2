package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        int res = 0;
        while (count != multiplyByAndToInclusive) {
            res *= count;
            if (multiplyByAndToInclusive > 0) {
                count ++;
            } else {
                count++;
            }
    }
        System.out.println(res * multiplyByAndToInclusive);
}
    }
