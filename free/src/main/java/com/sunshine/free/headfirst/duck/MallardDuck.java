package com.sunshine.free.headfirst.duck;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior =new FlyWithWings();

    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
