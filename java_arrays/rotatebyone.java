public class rotatebyone{
    public static void main(String args[]){
        //rotate array by 1 towards right
        int arr1[]={1,5,4,3,2,7};
        int arr2[] = {1,5,4,3,2,7};
        int n=arr1.length;
        int m=arr2.length;
        rotateright(arr1,n);
        rotateleft(arr2, m);
    }
    public static void rotateright(int arr1[],int n){
        
        int temp=arr1[n-1];
        for(int i=n-2;i>=0;i--){
            arr1[i+1]=arr1[i];
        }
        arr1[0]=temp;
        System.out.println("after rotating the array by 1 towards right");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
            

        }
        System.out.println();

    }
    public static void rotateleft(int arr2[],int m){
        int temp=arr2[0];
        for(int i=1;i<m;i++){
            arr2[i-1]=arr2[i];

        }
        arr2[m-1]=temp;
        System.out.println("after rotating the array by 1 towards left");
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
