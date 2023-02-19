package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        System.out.println(2);
        while (count != printToInclusive + 1){
            if (count % 2 != 0) {
                System.out.println(count);
            }
            count ++;
        }
    }
}
