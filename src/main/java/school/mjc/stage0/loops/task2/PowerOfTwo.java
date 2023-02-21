package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }else {
            System.out.println(1);
            int count = 1;
            int prev = 1;
            while (count != power + 1) {
                System.out.println(2*prev);
                prev = 2*prev;
                count++;
            }
        }

    }
}
