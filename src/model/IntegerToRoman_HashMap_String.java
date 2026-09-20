package model;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToRoman_HashMap_String {
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }

        // Roman numeral mapping
        Map<Integer, String> romanMap = new HashMap<>();
        romanMap.put(1000, "M");
        //romanMap.put(900,  "CM");
        romanMap.put(500,  "D");
       // romanMap.put(400,  "CD");
        romanMap.put(100,  "C");
        //romanMap.put(90,   "XC");
        romanMap.put(50,   "L");
        //romanMap.put(40,   "XL");
        romanMap.put(10,   "X");
        //romanMap.put(9,    "IX");
        romanMap.put(5,    "V");
        //romanMap.put(4,    "IV");
        romanMap.put(1,    "I");

        // Keys in descending order
        int[] keys = {1000, 500, 100, 50, 10, 5,  1};

        // Use plain String (less efficient than StringBuilder, but works fine for small strings)
        String result = "";

        for (int key : keys) {
            while (num >= key) {
                result += romanMap.get(key); // append Roman symbol
                num -= key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//    	Scanner sc =new Scanner(System.in);
//    	int input=sc.nextInt();
//    	sc.nextLine();
//    	System.out.println(intToRoman(input));
        System.out.println(intToRoman(1994)); // MCMXCIV
        System.out.println(intToRoman(58));   // LVIII
        System.out.println(intToRoman(4));    // IV
    }
}


/*import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/public class RomanString {

	public static void main(String[] args) {
		Map<Integer, String> mylist = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number : ");
		int input = sc.nextInt();
		sc.nextLine();

		mylist.put(1000, "M");
		//mylist.put(900, "CM");
		mylist.put(500, "D");
	//	mylist.put(400, "CD");
		mylist.put(100, "C");
		//mylist.put(90, "IL");
		mylist.put(50, "L");
		//mylist.put(40, "XL");
		mylist.put(10, "X");
		//mylist.put(9, "IX");
		mylist.put(5, "V");
		//mylist.put(4, "IV");
		mylist.put(1, "I");
		
		int[] keys= {1000,500,100,50,40,10,5,1};
		String result="";
		for (int key : keys) {
			while(input>key) {
				result += mylist.get(key);
				input-=key;
			}
		}
		System.out.println(result);

		// mylist.remove(5);

//		mylist.get(input);
		// String result=""; 132 //CXLII

		// mylist.containsKey(input)
//
//		for (Integer li : mylist.keySet()) {
//			System.out.println(li);
//		}
//		for(String li : mylist.values()) {
//			System.out.println(li);
//		}

//		if (mylist.containsKey(input)) {
//			System.out.println(mylist.get(input));
//
//		}else {
//			
//		}

		// System.out.println(mylist.get(input));
	}
}

/*
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class IntegerToRoman_HashMap_String { public static String
 * intToRoman(int num) { if (num <= 0 || num > 3999) { throw new
 * IllegalArgumentException("Number must be between 1 and 3999"); }
 * 
 * // Roman numeral mapping Map<Integer, String> romanMap = new HashMap<>();
 * romanMap.put(1000, "M"); romanMap.put(900, "CM"); romanMap.put(500, "D");
 * romanMap.put(400, "CD"); romanMap.put(100, "C"); romanMap.put(90, "XC");
 * romanMap.put(50, "L"); romanMap.put(40, "XL"); romanMap.put(10, "X");
 * romanMap.put(9, "IX"); romanMap.put(5, "V"); romanMap.put(4, "IV");
 * romanMap.put(1, "I");
 * 
 * // Keys in descending order int[] keys = {1000, 900, 500, 400, 100, 90, 50,
 * 40, 10, 9, 5, 4, 1};
 * 
 * // Use plain String (less efficient than StringBuilder, but works fine for
 * small strings) String result = "";
 * 
 * for (int key : keys) { while (num >= key) { result += romanMap.get(key); //
 * append Roman symbol num -= key; } }
 * 
 * return result; }
 * 
 * public static void main(String[] args) {
 * System.out.println(intToRoman(1994)); // MCMXCIV
 * System.out.println(intToRoman(58)); // LVIII
 * System.out.println(intToRoman(4)); // IV } }
 */
