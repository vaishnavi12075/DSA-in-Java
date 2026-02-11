public class union {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int b[]={2,4,6,8};
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length ){
            if(a[i]<b[j]){
                c[k++]=a[i];
                i++;

            }else if(a[i]>b[j]){
                c[k++]=b[j];
                j++;
            }else{
                c[k++]=a[i];
                i++;
                j++;
            }
        }
        c[k++]=b[j];
        for( i=0;i<k;i++){
            System.out.print(c[i]+" ");
        }
    }
}
