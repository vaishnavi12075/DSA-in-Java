public class reverse{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int array[]=new int[5];
        int n=arr.length;
        int j=0;
        for(int i=n-1;i>=0;i--){
            array[j]=arr[i];
            j++;

        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
