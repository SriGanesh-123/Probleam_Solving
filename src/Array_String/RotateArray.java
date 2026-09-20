package Array_String;
 import java.util.*;
 public class RotateArray {
    public static void main(String[] args) {
        String[] arr = {"apple","banana","cherry","date"};
        int k = 2;
        k = k % arr.length;
        String[] rotated = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i+k)%arr.length];
        }
        System.out.println(Arrays.toString(rotated));
    }
 }