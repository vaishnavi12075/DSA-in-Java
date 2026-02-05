public class posneg {
    public static void main(String args[]){
        int arr[]={1,2,-3,-5,6,-9};
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            if(arr[start]<0){
                start++;
            }else if(arr[end]>0){
                end--;
            }else{
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
