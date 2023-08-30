package BTVN2;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Số lượng số Fibonacci bạn muốn in ra
        System.out.println("Dãy Fibonacci gồm " + n + " số:");

        int prev1 = 0;
        int prev2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(prev1 + " ");
            int sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;
        }

    }
//    public static int fibonacci(int n) {
//        int soDau =1;
//        int soHai = 1;
//        int result =0;
//        for (int i=2;i<=n;i++) {
//            result = soDau + soHai;
//            soDau = soHai;
//            soHai = result;
//        }
//        return result;
//    }


}
