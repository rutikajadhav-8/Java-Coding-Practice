package Questions;

import java.util.Arrays;

public class Q12_ReverseArray {
    public static void reverseArr(int[]arr){
        if(arr == null || arr.length < 2){
            return;
        }

        int j = arr.length-1;
        for(int i=0; i<arr.length /2 ; i++){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    public static void main(String[]args){
      int []arr = {1,2,3,4,5,6};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));

    }
}
