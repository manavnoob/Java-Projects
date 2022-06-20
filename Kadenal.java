import java.util.Scanner;

public class Kadenal {
    public static int maxsumsubarray(int arrc[]) {
        int maxsum = 0;
        int cursum = 0;

        for(int i=0;i<arrc.length;i++) {
            cursum += arrc[i];

            if(cursum > maxsum) {
                maxsum = cursum;
            }
            if(cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers are there: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int result = maxsumsubarray(arr);
        System.out.println("The maximum sum of sub array is "+result);
    }
}
