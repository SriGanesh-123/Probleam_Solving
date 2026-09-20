package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Coin_Change {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of coins : ");
	int n = sc.nextInt();
	int[] coins = new int[n];
	System.out.println("Enter the " + n + " coins value  : ");
	for (int i = 0; i < n; i++) {
		coins[i] = sc.nextInt();
	}
	for (int i = 0; i < coins.length; i++) {
		for (int j = 0; j < coins.length - 1 - i; j++) {
			if (coins[j] < coins[j + 1]) {
				int temp = coins[j];
				coins[j] = coins[j + 1];
				coins[j + 1] = temp;
			}
		}

	}
	System.out.println("Enter the Amount");
	int amt=sc.nextInt();
	int result=coinChange(coins,amt);
	 System.out.println("Minimum coins: " + result);
	}
	
	public static int coinChange(int[] coins, int amount) {
        
        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }

        return (amount == 0) ? count : -1;
    
	}
}

