package fibonacci;

import java.util.Scanner;
import java.util.List;

public class FibonacciUI {
    private Fibonacci f = new Fibonacci();

    public FibonacciUI(int i) {
        List<Integer> fib = f.createfib(i);
        for(Integer j : fib.subList(0, i)) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci generator\nPlease enter length of sequence:");
        try {
            String length = input.nextLine();
            FibonacciUI fibUI = new FibonacciUI(Integer.parseInt(length));
        } catch (Exception e) {
            System.out.println("Please enter a number equal to or greater than 0");
        }
    }



}
