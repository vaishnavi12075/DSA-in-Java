public class sum {
    public static void main(String args[]) {
        int arr[] = {8, 6, 9, 4, 5};
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];   
        }

        System.out.println(sum);
    }
}
