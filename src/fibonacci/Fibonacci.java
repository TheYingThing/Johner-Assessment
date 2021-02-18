package fibonacci;

import java.util.LinkedList;
import java.util.List;

public class Fibonacci {
    public List<Integer> fib = new LinkedList<>();

    public List<Integer> createfib(int i) {
        int old;
        int prev = 0;
        int current = 1;
        fib.add(prev);
        fib.add(current);
        while (i-2 > 0) {
            old = current;
            current = prev + current;
            prev = old;
            i--;
            fib.add(current);
        }
        return fib;
    }
}

