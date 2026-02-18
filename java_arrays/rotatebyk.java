import java.util.*;

public class rotatebyk {
    static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        
    }
    void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        rotatebyk r=new rotatebyk();
        int arr1[]={1,2,5,6,3,2,1};
        int arr2[]={1,2,5,6,3,2,1};
        int n=arr1.length;
        int m=arr2.length;
        int start=0,end=n-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of places to be rotated");
        int k=sc.nextInt();
        System.out.println("rotation of array by k units towards left");
        reverse(arr1, 0, k-1);
        reverse(arr1, k, n-1);
        reverse(arr1, 0, n-1);

        r.display(arr1,n);
        System.out.println("rotation of array by k units towards right");
        reverse(arr2, 0, n-k-1);
        reverse(arr2, n-k, n-1);
        reverse(arr2, 0, n-1);

        r.display(arr2, n);


        

        }
        


    
    
}
