package Array_String;

import java.util.*;
public class Anagram_Grouping {
   public static void main(String[] args) {
       String[] arr = {"eat","tea","tan","ate","nat","bat"};
       List<List<String>> result = new ArrayList<>();
       boolean[] visited = new boolean[arr.length];
       for (int i = 0; i < arr.length; i++) {
           if (!visited[i]) {
               List<String> group = new ArrayList<>();
               group.add(arr[i]);
               visited[i] = true;
               char[] chars1 = arr[i].toCharArray();
               Arrays.sort(chars1);
               String sorted1 = new String(chars1);
               for (int j = i + 1; j < arr.length; j++) {
                   char[] chars2 = arr[j].toCharArray();
                   Arrays.sort(chars2);
                   String sorted2 = new String(chars2);
                   if (sorted1.equals(sorted2)) {
                       group.add(arr[j]);
                       visited[j] = true;
                   }
               }
               result.add(group);
           }
       }
       System.out.println(result);
   }
}