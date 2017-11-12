import java.util.*;
import java.lang.*;
import java.io.*;

    class separate0and1 {
        public static void rotate(int arr[], int n) {
          int l=0,r=n-1;
          int temp;
            while(l<r){
                if(arr[l]==0) l++;
                if(arr[r]==1) r--;
                if(arr[l]==1 && arr[r]==0){
                    temp =arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                }
            }
        }

        public static void main(String[] args){
        int[] arr = {0,1,1,0};
        separate0and1(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



        }
    }



