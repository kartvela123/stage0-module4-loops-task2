package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
            System.out.println(1);
            int count = 1;
            int prev = 1;
            while (count != printToInclusive + 1) {
                System.out.println(count * prev);
                prev = count * prev;
                count++ ;

            }
        }

        }


