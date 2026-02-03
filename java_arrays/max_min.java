public class max_min{
    public static void main(String args[]){
        int arr[]={25,4,36,2,9};
        int max=arr[0];
        int min=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                
                min=arr[i];
            }
        }
        System.out.println("the maximum element in array"+max);
        System.out.println("the minimum element in array"+min);



    }
}