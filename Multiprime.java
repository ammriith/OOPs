import java.util.Scanner;


class Multiplication extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 x " + i + " = " + (5 * i));
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Multiplication thread interrupted.");
        }
    }
}


class Prime extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to print: ");
        int limit = sc.nextInt();
        int count = 0;
        int num = 2;

        try {
            while (count < limit) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Prime number: " + num);
                    count++;
                    Thread.sleep(200);
                }
                num++;
            }
        } catch (InterruptedException e) {
            System.out.println("Prime thread interrupted.");
        }
    }
}


public class Multiprime {
    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        Prime p = new Prime();

        m.start();
        p.start();
    }
}

