package com.sunshine.free.headfirst.duck;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm can't fly");
    }
}
