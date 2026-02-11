public class intersection {
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int b[]={2,4,6,8};
        int n=a.length;
        int c[]=new int[Math.min(n, b.length)];
        
        int i=0;
        int j=0,k=0;
        while(i<n&& j<b.length){
            if(a[i]<b[j]){
                i++;

            }else if(a[i]>b[j]){
                j++;
            }else{
                c[k++]=a[i];
                i++;
                j++;

            }

        }
        for(i=0;i<k;i++){
            System.out.println(c[i]+" ");

        }
    }
    
}
