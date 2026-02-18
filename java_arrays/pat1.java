// import java.util.Scanner;

public class pat1 {
    public static void main(String args[]){
        int i,j=0;
        System.out.println("pattern is:");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                int n=i+j;
                if(n%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }


            }
            System.out.println("");
        }
        
        
        

    }
    
}
