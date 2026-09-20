package Number;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        sc.close();
    }

    // Function to check prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}



/*public class PrimeCheck {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;

        // eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // check only numbers of form 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 37;
        System.out.println(num + (isPrime(num) ? " is Prime" : " is NOT Prime"));
    }
}
*/
