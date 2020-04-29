/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
class SumEven extends Thread {
    private int Start;
    private int End;
    public SumEven(int start, int end) {
        this.Start = start;
        this.End = end;
    }
    public void run () {
        long sum = 0;
        if (Start % 2 != 0) {
            Start = Start + 1;
        }
        if (End % 2 != 0) {
            End = End - 1;
        }
        for (int i = Start; i <= End; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread t1 = new SumEven(3, 9);
        t1.start();
        Thread t2 = new SumEven(10, 15);
        t2.start();
    }
}
