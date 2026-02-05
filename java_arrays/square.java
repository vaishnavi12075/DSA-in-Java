import java.util.*;
public class square {
    public static void main(String args[]){
        int arr[]={1,-9,4,7,-2};
        int n=arr.length;
        int sq=0,j=0;
        for(int i=0;i<n;i++){
            sq=arr[i]*arr[i];
            arr[j++]=sq;

        }
        Arrays.sort(arr);
        System.out.println("squares of arrays elemnts in sorted way");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
