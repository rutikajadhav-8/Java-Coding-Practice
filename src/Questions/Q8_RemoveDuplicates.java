package Questions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q8_RemoveDuplicates {
    static void removeDup(int []arr){

        LinkedHashSet <Integer> set = new LinkedHashSet<>();

        for (int j : arr) {
            set.add(j);
        }
        System.out.println(set);

    }

    //using two pointer
    static int removeDup2(int []arr){
       Arrays.sort(arr); //for unsorted array
        int i=0;
        for(int j=1; j<arr.length;){
            if(arr[i] == arr[j]) {
                j++;
            }
            else {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;

    }

    public static void main(String[]args){
       int []arr = {0,0,1,4,3,1,1,2,2,3,4};
       removeDup(arr);
       System.out.println(removeDup2(arr));
    }
}
