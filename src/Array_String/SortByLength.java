package Array_String;
 import java.util.*;
 public class SortByLength {
    public static void main(String[] args) {
        String[] arr = {"cat","a","apple","dog","on"};
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(arr));
    }
 }