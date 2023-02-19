package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        System.out.println(0);
        while (count != printToInclusive + 1) {
            int prev = count;
            count ++ ;
            System.out.println(count * prev);

        }

    }
}
