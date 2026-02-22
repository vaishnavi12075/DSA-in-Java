public class hasharray_char {
    public  int hashchar(String str,char ch){
        int hash[]=new int[256];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)]++;
        }
        return hash[ch];
    }
    public static void main(String args[]){
        String str="good morning" ;
        hasharray_char c=new hasharray_char();
        int k=c.hashchar(str,'o');
        System.out.println("the frequency of char:'o' is:"+k);
    }
}
