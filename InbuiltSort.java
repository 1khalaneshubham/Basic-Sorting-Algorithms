import java.util.*;
import java.util.Arrays;
//
public class InbuiltSort{
    public static void printArr(int arr[]){
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        int arr[] = {12,13,14,84,98,89,99};
        //inbuilt Sort
        Arrays.sort(arr);
        Arrays.sort(arr,1,4); // array sort from 0 to n tecnic
        printArr(arr);
    }
   
}
