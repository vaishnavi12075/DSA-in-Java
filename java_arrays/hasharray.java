public class hasharray {
    public static int hashtable(int nums[],int val){
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            
            maxi=Math.max(maxi,nums[i]);

        }
        
        int hash[]=new int[maxi+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        return hash[val];

    }
    public static void main(String args[]){
        int nums[]={1,1,2,3,3,2,3,2,3,3,3};
        int k=hashtable(nums,3);
        System.out.println("frequency of 3 is: "+k);
    }
    
}
