package Lab12;

import java.util.Stack;

public class PrimeNumbersStack {
    public static void main(String[] args) {
        Stack<Integer> primes = collectPrimes(50);
        displayPrimes(primes);
    }


    private static Stack<Integer> collectPrimes(int quantity) {
        Stack<Integer> primes = new Stack<>();
        int count = 0;
        int number = 2;
        while (count < quantity) {
            if (isPrime(number)) {
                primes.push(number);
                count++;
            }
            number++;
        }
        return primes;
    }


    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    private static void displayPrimes(Stack<Integer> primes) {
        System.out.println("First 50 Prime Numbers in Descending Order:");
        while (!primes.isEmpty()) {
            System.out.print(primes.pop() + " ");
        }
        System.out.println();
    }
}
