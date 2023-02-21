package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 0;
        while (count != printToInclusive + 1) {
            if (count != 0 && count != 1) {
                int count2 = 2;
                int flag = 0;
                while (count2 != count/2 + 1) {
                    if (count % count2 == 0) {
                        flag = 1;
                    }
                    count2++;
                }
                if (flag == 0) {
                    System.out.println(count);
                }

            }
            count++;
        }
    }
}
