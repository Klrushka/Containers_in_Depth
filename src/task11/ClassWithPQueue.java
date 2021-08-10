package task11;

import java.util.PriorityQueue;
import java.util.Random;

public class ClassWithPQueue implements Comparable<ClassWithPQueue> {
    private Integer integer = new Random().nextInt(100);
    private PriorityQueue<ClassWithPQueue> integers = new PriorityQueue<>();

    public void fillQueue(int n) {
        for (int i = 0; i < n; i++) {
            integers.add(new ClassWithPQueue());
        }
    }


    @Override
    public int compareTo(ClassWithPQueue o) {
        if (integer > o.integer) {
            return +1;
        }
        if (integer.equals(o.integer)) {
            return 0;
        }

        return -1;
    }

    @Override
    public String toString() {
        return integer.toString();
    }

    public PriorityQueue<ClassWithPQueue> getIntegers() {
        return integers;
    }
}
