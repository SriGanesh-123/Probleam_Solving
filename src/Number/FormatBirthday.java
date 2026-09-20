package Number;
import java.util.Date;
import java.text.SimpleDateFormat;

public class FormatBirthday {
    public static void main(String[] args) {
        // Step 1: Create a Date object with your birthday
        // ⚠ Date(year, month, day) is deprecated
        // Year is "year - 1900", and month is 0-based (0 = Jan)
        Date birthday = new Date(2000 - 1900, 5 - 1, 18);  // 2000-05-18

        // Step 2: Create formatter
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        // Step 3: Format and print
        String formattedDate = formatter.format(birthday);
        System.out.println("My Birthday: " + formattedDate);
    }
}
//dei idhu 13th question oda answer idhu chatgpt kuduthuchu but still idhuku y 2000-1900 pandrom nu puriyala
/*package homework.string;
import java.util.Scanner;
public class romanletter {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Input : " + number);
        System.out.println("Roman : " + intToRoman(number));
    }
    public static String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,  5, 4, 1};
        String[] romans = {"M",  "CM","D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();
       for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romans[i]);
            }
        }
        return result.toString();
    }
}*/