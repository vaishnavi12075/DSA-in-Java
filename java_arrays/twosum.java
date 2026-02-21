public class twosum {
    //two-pointer method for sorted array
    public static int[] sum(int a[],int k){
        int l=0;
        int r=a.length-1;
        while(l<=r){
            if(a[l]+a[r]>k){
                r--;
            }else if(a[l]+a[r]<k){
                l++;
            }else{
                return new int[]{l,r};
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int a[]={2,4,6,7,7,8};
        int k;
        int v[]=sum(a,20);
        System.out.println("["+v[0]+","+v[1]+"]");
    }
    
}
