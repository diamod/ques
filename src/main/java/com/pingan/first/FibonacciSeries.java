package com.pingan.first;


import java.math.BigInteger;

/**
 * 4782
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(fs());
    }

    /**
     * 顺序推演斐波那契数列fn
     * 特定长度之后的下标n
     * @return
     */
    public static int fs() {
        //起点 f2 f1 f0
        BigInteger fsecond = BigInteger.ONE;
        BigInteger ffirst = BigInteger.ONE;
        BigInteger fzeroth = BigInteger.ZERO;
        //推演轮数
        int i = 0;
        while (true){
            if(fsecond.toString().length() >= 1000){
                break;
            }else{
                fzeroth = fsecond;
                fsecond = ffirst.add(fsecond);
                ffirst = fzeroth;
                i++;
            }

        }
        //基于起点f2基础上计算结果值下标
        return i+2;
    }

}
