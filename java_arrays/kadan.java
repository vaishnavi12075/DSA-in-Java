import java.util.*;
public class kadan {
    public static int kadane(int arr[],int maxsum,int sum){
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                maxsum=Math.max(sum,maxsum);
                sum=0;
            }else{
                maxsum=Math.max(sum,maxsum);
            }
        }
        return maxsum;
    }
    public static void main(String args[]){
        int[] arr={-2,-5,7,6,-4,2,-4};
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int v=kadane(arr,maxsum,sum);
        System.out.println(v);
    }
    
}
