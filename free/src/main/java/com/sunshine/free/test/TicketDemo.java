package com.sunshine.free.test;

import java.util.Map;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class TicketDemo extends Thread{

    private static int index=1;
    private static final int MAX=100;

    @Override
    public void run() {
        int n = 0;
      //  synchronized (this) {
            while (index < MAX) {
                System.out.println(Thread.currentThread().getName() + "叫到得号码是：" + index++);
                n++;
            }
  //      }
        System.out.println("计数："+n);
    }

    public static void main(String[] args) {
        TicketDemo t0 = new TicketDemo();
        TicketDemo t1 = new TicketDemo();
        TicketDemo t2 = new TicketDemo();

        t0.start();
        t1.start();
        t2.start();
    }
}
