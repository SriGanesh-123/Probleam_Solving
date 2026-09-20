package String;

import java.util.Scanner; 

public class RemoveDuplicate { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the String : ");
        String s = sc.nextLine(); 
 
        boolean[] seen = new boolean[256]; 
        String result = ""; 
 
        for (int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i); 
            if (!seen[c]) { 
                result += c; 
                seen[c] = true; 
            } 
        } 
        System.out.println(result); 
    } 
}



/*StringBuilder result = new StringBuilder();

for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if (!seen[c]) {
        result.append(c);
        seen[c] = true;
    }
}

System.out.println(result.toString());
*/
