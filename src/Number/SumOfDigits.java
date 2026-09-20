package Number;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}