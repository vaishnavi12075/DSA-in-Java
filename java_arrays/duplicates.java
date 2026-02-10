import java.util.*;
public class duplicates {
    public static void main(String args[]){
        int arr[]={4,5,4,3,6,7,5,6};
        int n=arr.length;
        int j=0;
        Arrays.sort(arr);
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        System.out.println("array including duplicates");
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
}
