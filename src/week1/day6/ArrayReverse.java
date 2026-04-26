package week1.day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("原始数组："+ Arrays.toString(arr));

        //反转数组
        reverse(arr);
        System.out.println("反转后的数组："+Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int left = 0;//左指针
        int right = arr.length-1;//右指针

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
