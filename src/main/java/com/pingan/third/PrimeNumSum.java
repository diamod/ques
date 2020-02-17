package com.pingan.third;

import java.math.BigInteger;

/**
 * 142913828922
 */
public class PrimeNumSum {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i < 2000000; i++) {
            if(isPrime(i)){
                sum = sum.add(BigInteger.valueOf(i));
            }
        }

        System.out.println(sum.toString());

    }


    public static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        //检查是否2的倍数
        if(n % 2 == 0){
            return false;
        }
        // 只有6x-1和6x+1的数才有可能是质数
        if(n > 6){
            if (n % 6 != 1 && n % 6 != 5) {
                return false;
            }
        }
        //从sqrt(n)检索，且只需检索奇数（不是2的倍数必然不会是4、6、8..倍数）
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i += 2) {
            if (i !=1 && (n % i == 0)) {
                return false;
            }
        }
        return true;
    }

}
