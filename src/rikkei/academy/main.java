package rikkei.academy;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra");
        int number = sc.nextInt();

        int count = 0;
        int N = 2;
        while (count < number) {
            if(checkPrime(N)) {
                System.out.println(N + "");
                count++;
            }
            N++;
        }

    }
    private static boolean checkPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return  true;
    }

}
