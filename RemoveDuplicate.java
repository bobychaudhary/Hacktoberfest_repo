import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D1_All_are_Same {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer> answer=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int k = Math.abs(arr[i] - arr[j]);
                    if (k != 0) {
                        answer.add(k);
                    }
                }
            }
            int ans=0;
            for (Integer integer : answer) {
                ans=gcd(ans,integer);

            }
            if(ans==0){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }

        }
    }
    static int gcd(int a, int b) {
        if (b > a) {
            return gcd(b, a);
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
