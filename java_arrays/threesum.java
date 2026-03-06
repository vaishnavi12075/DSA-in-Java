import java.util.*;
public class threesum {
    public static int three1sum(int nums[],int target){
        int close=nums[0]+nums[1]+nums[2];
        int k;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            

            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(close-target)){
                    close=sum;
                }
                if(sum>target){
                    
                    
                    right--;

                }else if(sum<target){
                    
                    left++;
                }else{
                    return sum;
                }
            }

        }
        return close;

        


    }
    public static void main(String args[]){
        int nums[]={0,0,0,0,0};
        int m=three1sum(nums, 1);
        System.out.println(m);

        
    }
    
}
