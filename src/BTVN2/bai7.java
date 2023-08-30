package BTVN2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n");
        int n = sc.nextInt();
        //dùng for
        int gt =1;
        for(int i =1; i<=n; i++) {
            gt *=i;
        }

        for(int i = n; i >=2 ; i--) {
            gt *=i;
        }
       // int giaiThua =  giaiThua(n);
        System.out.println("Giai thua la " + gt);
        //while
        int j =1;
        int gt2 = 1;
        while(j<=n) {
            gt2 *= j;
            j++;
        }
        System.out.println(n + " ! = " + gt2);
        sc.close();
    }

    //Đệ quy em ưiii
    public static  long giaiThua(int n) {
        if(n == 0) {
            return  1;
        }
        return  n * giaiThua(n-1);
    }
}
