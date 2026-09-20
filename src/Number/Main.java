package Number;
public class Main {
    public static int squareRoot(int n) {
        int i = 1;
        
        while (i * i <= n) {
            i++;
        }
        
        return i - 1;   // because loop stops when i*i > n
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(4));  // 2
        System.out.println(squareRoot(8));  // 2
    }
}