public class AddNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
# code changed by feature201
public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
# code changed by featur202
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");
    }
}
# end 